package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175848 Partial sums of ceiling(n^2/16).
 * @author Sean A. Irvine
 */
public class A175848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175848() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 1, 2, 3, 4, 6, 9, 13, 17, 23, 30});
  }
}
