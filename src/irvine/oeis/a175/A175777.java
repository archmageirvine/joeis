package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175777 Partial sums of <code>floor(n^2/16)</code>.
 * @author Sean A. Irvine
 */
public class A175777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175777() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 0, 1, 2, 4, 7, 11, 16, 22});
  }
}
