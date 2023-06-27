package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193218 Number of vertices in truncated tetrahedron with faces that are centered polygons.
 * @author Sean A. Irvine
 */
public class A193218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193218() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 21, 95, 259});
  }
}
