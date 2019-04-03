package irvine.oeis.a296;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A296910 a(0)=1, a(1)=4; thereafter a(n) = 4*n-2*(-1)^n. 
 * @author Georg Fischer
 */
public class A296910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A296910() {
    super(new long[] {-1L, 1L, 1L}, new long[] {6L, 14L, 14L}, new long[] {1L, 4L});
  } // constructor()
} // A296910
