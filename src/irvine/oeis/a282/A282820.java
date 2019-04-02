package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282820 Number of inequivalent ways to color the edges of a tetrahedron using at most n colors so that no color appears more than twice.
 * @author Sean A. Irvine
 */
public class A282820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282820() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 9, 132, 720, 2580});
  }
}
