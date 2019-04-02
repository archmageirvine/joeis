package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295691 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 2, a(1) = 2, a(2) = 2, a(3) = 1. 
 * @author Georg Fischer
 */
public class A295691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295691() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {2L, 2L, 2L, 1L});
  } // constructor()
} // A295691
