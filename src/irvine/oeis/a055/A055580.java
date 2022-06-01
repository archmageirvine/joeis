package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055580 Bj\u00f6rner-Welker sequence: 2^n*(n^2 + n + 2) - 1.
 * @author Sean A. Irvine
 */
public class A055580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055580() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 7, 31, 111});
  }
}
