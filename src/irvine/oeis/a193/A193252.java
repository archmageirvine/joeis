package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193252 Great rhombicuboctahedron with faces of centered polygons.
 * @author Sean A. Irvine
 */
public class A193252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193252() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 75, 365, 1015});
  }
}
