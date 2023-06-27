package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097108 If a geodesic dome is made by dividing each triangle of an icosahedron into n^2 identical equilateral triangles and the vertices of those newly created triangles are pushed out from the center to lie on the surface of the sphere in which the icosahedron is inscribed, then this sequence gives the number of different strut lengths that are required to build the dome.
 * @author Sean A. Irvine
 */
public class A097108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097108() {
    super(1, new long[] {1, 0, 0, -2, 0, 0, 0, 0, 0, 2, 0, 0}, new long[] {1, 2, 3, 6, 9, 9, 16, 20, 18, 30, 36, 30});
  }
}
