package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144873 If n mod 8 = 0 or n mod 10 = 0 then floor(n^2/4)+n otherwise floor(n^2/4)+n-1.
 * @author Sean A. Irvine
 */
public class A144873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144873() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 2, 4, 7, 10, 14, 18, 24, 28, 35, 40, 47, 54, 62, 70, 80, 88, 98, 108, 120, 130, 142, 154, 168, 180, 194, 208, 223, 238, 255, 270, 288, 304, 322, 340, 359, 378, 398, 418, 440, 460});
  }
}
