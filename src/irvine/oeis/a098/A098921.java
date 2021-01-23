package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098921 Let [n] = {1,2,...,n}. Let G_n be the union of all closed line segments joining any two elements of [n] X [n] along a vertical or horizontal line, or along a line with slope +-1. Then a(n) = combined total of the number of (nondegenerate) triangles and rectangles for which all edges are subsets of G_n.
 * @author Sean A. Irvine
 */
public class A098921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098921() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 9, 62, 211, 534, 1127});
  }
}
