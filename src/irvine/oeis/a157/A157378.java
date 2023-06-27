package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157378 a(n) = 43046721*n^2 - 50729652*n + 14945957.
 * @author Sean A. Irvine
 */
public class A157378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157378() {
    super(1, new long[] {1, -3, 3}, new long[] {7263026, 85673537, 250177490});
  }
}
