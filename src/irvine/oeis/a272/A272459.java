package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272459 The total number of different isosceles trapezoids, excluding squares, that can be drawn on a <code>n X n</code> square grid where the corners of each individual trapezoid lie on a lattice point.
 * @author Sean A. Irvine
 */
public class A272459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272459() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 1, 7, 18, 40, 71});
  }
}
