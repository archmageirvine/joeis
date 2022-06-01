package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175822 Partial sums of ceiling(n^2/7).
 * @author Sean A. Irvine
 */
public class A175822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175822() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 1, -3, 3}, new long[] {0, 1, 2, 4, 7, 11, 17, 24, 34, 46});
  }
}
