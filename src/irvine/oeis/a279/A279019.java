package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279019 Least possible number of diagonals of simple convex polyhedron with n faces.
 * @author Sean A. Irvine
 */
public class A279019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279019() {
    super(new long[] {1, -3, 3}, new long[] {0, 0, 2});
  }
}
