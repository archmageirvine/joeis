package irvine.oeis.a299;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A299198 a(n) = n^4/6 - 2*n^3/3 - n^2/6 + 5*n/3 + 1.
 * @author Georg Fischer
 */
public class A299198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A299198() {
    super(1, new long[] {1L, -5L, 10L, -10L, 5L}, new long[] {2L, 1L, 0L, 5L, 26L});
  } // constructor()
} // A299198
