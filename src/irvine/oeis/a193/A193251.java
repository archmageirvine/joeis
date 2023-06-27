package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193251 Small rhombicosidodecahedron with faces of centered polygons.
 * @author Sean A. Irvine
 */
public class A193251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193251() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 123, 605, 1687});
  }
}
