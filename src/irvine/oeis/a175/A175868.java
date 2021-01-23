package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175868 Partial sums of ceiling(n^2/20).
 * @author Sean A. Irvine
 */
public class A175868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175868() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 1, 2, 3, 4, 6, 8, 11, 15, 20, 25, 32, 40});
  }
}
