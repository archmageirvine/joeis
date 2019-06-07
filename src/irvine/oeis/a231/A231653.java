package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231653 Number of non-equivalent ways to choose 4 points in an equilateral triangle grid of side <code>n</code>.
 * @author Sean A. Irvine
 */
public class A231653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231653() {
    super(new long[] {1, -2, -3, 5, 8, -3, -19, -4, 24, 15, -15, -24, 4, 19, 3, -8, -5, 3, 2}, new long[] {0, 0, 4, 41, 244, 1029, 3485, 9926, 25030, 57126, 120570, 238330, 446344, 797825, 1370684, 2274259, 3660612, 5734776, 8771181});
  }
}
