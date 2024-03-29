package irvine.oeis.a295;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A295685 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 2, a(1) = 1, a(2) = 1, a(3) = 1.
 * @author Georg Fischer
 */
public class A295685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295685() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {2L, 1L, 1L, 1L});
  } // constructor()
} // A295685
