package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216175 Number of all polyhedra (tetrahedra of any orientation and octahedra) of any size, formed when intersecting a regular tetrahedron by planes parallel to its sides and dividing its edges into n equal parts.
 * @author Sean A. Irvine
 */
public class A216175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216175() {
    super(1, new long[] {1, -3, 2, 1, 0, -1, -2, 3}, new long[] {1, 6, 20, 50, 104, 193, 329, 526});
  }
}
