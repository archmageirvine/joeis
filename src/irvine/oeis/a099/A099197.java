package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099197 Figurate numbers based on the 10-dimensional regular convex polytope called the 10-dimensional cross-polytope, or 10-dimensional hyperoctahedron, which is represented by the Schlaefli symbol <code>{3, 3, 3, 3, 3, 3, 3, 3, 4}</code>. It is the dual of the 10-dimensional hypercube.
 * @author Sean A. Irvine
 */
public class A099197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099197() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 20, 201, 1360, 7001, 29364, 104881, 329024, 927441, 2390004});
  }
}
