package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099196 Figurate numbers based on the 9-dimensional regular convex polytope called the 9-dimensional cross-polytope, or 9-dimensional hyperoctahedron, which is represented by the Schlaefli symbol {3, 3, 3, 3, 3, 3, 3, 4}. It is the dual of the 9-dimensional hypercube.
 * @author Sean A. Irvine
 */
public class A099196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099196() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 18, 163, 996, 4645, 17718, 57799, 166344, 432073});
  }
}
