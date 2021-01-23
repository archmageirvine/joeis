package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187452 Number of right isosceles triangles that can be formed from the n^2 points of n X n grid of points (or geoboard).
 * @author Sean A. Irvine
 */
public class A187452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187452() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 4, 28, 96, 244, 516});
  }
}
