package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175846 Partial sums of ceiling(n^2/15).
 * @author Sean A. Irvine
 */
public class A175846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175846() {
    super(new long[] {-1, 2, -1, 1, -2, 2, -2, 1, -1, 2}, new long[] {0, 1, 2, 3, 5, 7, 10, 14, 19, 25});
  }
}
