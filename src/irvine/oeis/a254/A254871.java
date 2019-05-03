package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254871 Seventh partial sums of fifth powers <code>(A000584)</code>.
 * @author Sean A. Irvine
 */
public class A254871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254871() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 39, 495, 3705, 19995, 85917, 311493, 989235, 2823990, 7383610, 17931498, 40889862, 88304970});
  }
}
