package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282819 Number of inequivalent ways to color the edges of a tetrahedron using at most n colors so that no two opposite edges have the same color.
 * @author Sean A. Irvine
 */
public class A282819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282819() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 2, 22, 152, 680, 2270});
  }
}
