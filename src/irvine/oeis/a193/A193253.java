package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193253 Great rhombicosidodecahedron with faces of centered polygons.
 * @author Sean A. Irvine
 */
public class A193253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193253() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 183, 905, 2527});
  }
}
