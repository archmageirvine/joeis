package irvine.oeis.a295;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A295682 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 0, a(1) = 2, a(2) = 0, a(3) = 1.
 * @author Georg Fischer
 */
public class A295682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295682() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {0L, 2L, 0L, 1L});
  } // constructor()
} // A295682
