package irvine.oeis.a171;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A171950 a(1)=1. a(n) = the absolute difference between (the sum of previous terms) and A000217(n-2), n&gt;1. 
 * @author Georg Fischer
 */
public class A171950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171950() {
    super(new long[] {-1L, 2L}, new long[] {3L, 4L}, new long[] {1L, 1L, 0L});
  } // constructor()
} // A171950
