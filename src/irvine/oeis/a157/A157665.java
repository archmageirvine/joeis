package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157665 a(n) = 729*n^2 - 1016*n + 354.
 * @author Sean A. Irvine
 */
public class A157665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157665() {
    super(1, new long[] {1, -3, 3}, new long[] {67, 1238, 3867});
  }
}
