package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008634 Molien series for <code>A_11</code>.
 * @author Sean A. Irvine
 */
public class A008634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008634() {
    super(new long[] {1, -1, -1, 0, 0, 0, 1, 2, 0, 0, 0, -1, -2, 0, -1, -2, 0, 2, 0, 2, 3, 1, 0, 1, -1, -3, 0, -2, -3, -1, 1, -1, 1, 3, 2, 0, 3, 1, -1, 0, -1, -3, -2, 0, -2, 0, 2, 1, 0, 2, 1, 0, 0, 0, -2, -1, 0, 0, 0, 1, 1},
      new long[] {1, 1, 2, 3, 5, 7, 11, 15, 22, 30, 42, 56, 76, 99, 131, 169, 219, 278, 355, 445, 560, 695, 863, 1060, 1303, 1586, 1930, 2331, 2812, 3370, 4035, 4802, 5708, 6751, 7972, 9373, 11004, 12866, 15021, 17475, 20298, 23501, 27169, 31316, 36043, 41373, 47420, 54218, 61903, 70515, 80215, 91058, 103226, 116792, 131970, 148848, 167673, 188558, 211785, 237494, 266013});
  }
}

