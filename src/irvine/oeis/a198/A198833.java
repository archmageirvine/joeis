package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198833 The number of inequivalent ways to color the vertices of a regular octahedron using at most n colors.
 * @author Sean A. Irvine
 */
public class A198833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198833() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 10, 56, 220, 680, 1771, 4060});
  }
}
