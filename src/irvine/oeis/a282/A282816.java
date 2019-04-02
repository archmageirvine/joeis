package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282816 Number of inequivalent ways to color the faces of a cube using at most n colors so that no two opposite sides have the same color.
 * @author Sean A. Irvine
 */
public class A282816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282816() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 1, 11, 76, 340, 1135});
  }
}
