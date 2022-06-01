package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122133 Number of different polyominoes with maximum area of the convex hull.
 * @author Sean A. Irvine
 */
public class A122133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122133() {
    super(new long[] {-1, 0, 2, 0, 1, 0, -4, 0, 1, 0, 2, 0}, new long[] {1, 1, 1, 3, 5, 11, 9, 26, 22, 53, 36, 93});
  }
}
