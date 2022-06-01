package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175724 Partial sums of floor(n^2/12).
 * @author Sean A. Irvine
 */
public class A175724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175724() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 0, 1, 3, 6, 10, 15});
  }
}
