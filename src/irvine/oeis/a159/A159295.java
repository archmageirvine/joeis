package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159295 Number of ways that a tile in the form of a strip of n congruent regular hexagons stuck together on successive parallel edges can be surrounded by one layer of copies of itself in a plane. Ways that differ by rotation or reflection are not counted as different. The surrounded tile is the exact surrounded region.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A159295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159295() {
    super(1, new long[] {1, -4, 3, 8, -14, 0, 14, -8, -3, 4},
      new long[] {1842, 4025, 7856, 14124, 23936, 38654, 60090, 90407, 132374, 189223}, 1, 747);
  }
}
