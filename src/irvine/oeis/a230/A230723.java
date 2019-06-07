package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230723 Number of non-equivalent ways to choose three points in an equilateral triangle grid of side <code>n</code>.
 * @author Sean A. Irvine
 */
public class A230723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230723() {
    super(new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {0, 1, 6, 25, 87, 238, 575, 1228, 2425, 4446, 7734, 12806});
  }
}
