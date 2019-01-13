package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079995.
 * @author Sean A. Irvine
 */
public class A079995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079995() {
    super(new long[] {-1, -1, 2, -1, -4, 4, 9, 3, -11, -1, 5, -7, -11, -9, 13, 6, 4, 3, 2, 1}, new long[] {1, 1, 2, 4, 14, 39, 103, 255, 665, 1741, 4605, 12046, 31474, 82206, 215157, 563083, 1473635, 3855111, 10085589, 26386595});
  }
}
