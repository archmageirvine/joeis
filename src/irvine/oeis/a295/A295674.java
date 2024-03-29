package irvine.oeis.a295;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A295674 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 1, a(1) = 2, a(2) = 4, a(3) = 8.
 * @author Georg Fischer
 */
public class A295674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295674() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {1L, 2L, 4L, 8L});
  } // constructor()
} // A295674
