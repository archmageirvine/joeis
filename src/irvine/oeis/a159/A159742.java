package irvine.oeis.a159;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A159742 If an array is made of columns of -nacci sequences (Fibonacci, tribonacci, etc.), all starting with 1,1,2,..., the NW-to-SE diagonals can be extended by computation. This sequence is diagonal 6. See A159741 for details. 
 * @author Georg Fischer
 */
public class A159742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159742() {
    super(new long[] {-2L, 3L}, new long[] {44L, 108L}, new long[] {13L});
  } // constructor()
} // A159742
