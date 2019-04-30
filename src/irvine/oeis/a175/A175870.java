package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175870 Partial sums of <code>ceiling(n^2/24)</code>.
 * @author Sean A. Irvine
 */
public class A175870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175870() {
    super(new long[] {-1, 2, -1, 1, -1, -1, 1, -1, 2}, new long[] {0, 1, 2, 3, 4, 6, 8, 11, 14});
  }
}
