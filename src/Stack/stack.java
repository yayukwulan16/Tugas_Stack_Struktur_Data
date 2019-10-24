/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Arrays;

/**
 *
 * @author Yayuk's
 */
public class stack {

    static String[] stack;
    static int ukuran;
    static int top;
    
    static void inisialisasi(int i)
    {
        ukuran=i;
        stack=new String[ukuran];
        top=0;
    }
    
    static boolean isempty()
    {
        return top<=0;
    }
    
    static boolean isfull()
    {
        return top>=ukuran;
    }
    
    static void insert(String i)
    {
        if(isfull())
            System.out.println("Rak Cangkir Telah Penuh");
        else
        {
            System.out.println("Cangkir Warna "+i+" Masuk Rak");
            stack[top++]=i;
        }
    }
    
    static void pick()
    {
        if(isempty())
            System.out.println("Maaf, Cangkir Tidak Ada");
        else
        {
            top--;
            System.out.println("Cangkir Warna"+stack[top]+" Diambil");            
        }
    }
    
    
    static void display()
    {
     int i=top-1;
     
     while(i>=0)
     {
         System.out.println("Cangkir ke :"+(i+1)+" Adalah Cangkir Warna:"+stack[i]);
         i--;
     }
    }
            
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        stack a=new stack();
        a.inisialisasi(5);
        a.pick();
        a.insert("Merah");
        a.insert("Kuning");
        a.insert("Hijau");
        a.insert("Biru");
        a.insert("Orange");
        System.out.println("Isi Cangkir Dalam Rak Adalah : ");
        a.display();
        a.insert("Putih");
        a.pick();
        a.display();
        
    }
}
