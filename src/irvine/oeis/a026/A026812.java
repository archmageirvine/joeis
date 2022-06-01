package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026812 Number of partitions of n in which the greatest part is 6.
 * @author Sean A. Irvine
 */
public class A026812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026812() {
    super(new long[] {-1, 1, 1, 0, 0, -1, 0, -2, 0, 1, 1, 1, 1, 0, -2, 0, -1, 0, 0, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 1, 1, 2, 3, 5, 7, 11, 14, 20, 26, 35, 44, 58, 71, 90});
  }
}
