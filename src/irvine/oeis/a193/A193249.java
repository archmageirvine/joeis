package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193249 Snub dodecahedron with faces of centered polygons.
 * @author Sean A. Irvine
 */
public class A193249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193249() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 153, 755, 2107});
  }
}
