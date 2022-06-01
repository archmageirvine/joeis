package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282818 Number of inequivalent ways to color the edges of a tetrahedron using at most n colors so that no two adjacent edges have the same color.
 * @author Sean A. Irvine
 */
public class A282818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282818() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 2, 20, 110, 460});
  }
}
