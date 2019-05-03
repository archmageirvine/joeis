package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126026 Conjectured upper bound on area of the convex hull of any <code>edge-to-edge</code> connected system of regular unit hexagons <code>(n-polyhexes)</code>.
 * @author Sean A. Irvine
 */
public class A126026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126026() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 2, 4, 5, 8, 10, 13, 17, 20, 24, 28, 33, 38, 43, 49, 55, 61, 68, 75});
  }
}
