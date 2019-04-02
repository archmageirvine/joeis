package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008632 Molien series for A_9.
 * @author Sean A. Irvine
 */
public class A008632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008632() {
    super(new long[] {1, -1, -1, 0, -1, 2, 1, 1, 1, -2, 0, -1, -3, 1, -1, 0, 3, 0, 2, 1, -1, 1, -1, -2, 0, -3, 0, 1, -1, 3, 1, 0, 2, -1, -1, -1, -2, 1, 0, 1, 1},
      new long[] {1, 1, 2, 3, 5, 7, 11, 15, 22, 30, 41, 54, 73, 94, 123, 157, 201, 252, 318, 393, 488, 598, 732, 887, 1076, 1291, 1549, 1845, 2194, 2592, 3060, 3589, 4206, 4904, 5708, 6615, 7658, 8825, 10158, 11651, 13343});
  }
}

