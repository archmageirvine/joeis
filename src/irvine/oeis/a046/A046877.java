package irvine.oeis.a046;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046877 a(n) = a(n-2) + a(n-3), with a(0) = 3, a(1) = 2, a(2) = 6.
 * @author Georg Fischer
 */
public class A046877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046877() {
    super(new long[] {1L, 1L, 0L}, new long[] {3L, 2L, 6L});
  } // constructor()
} // A046877
