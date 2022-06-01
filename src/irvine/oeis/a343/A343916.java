package irvine.oeis.a343;
// manually holink/holos at 2021-12-08 21:32

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A343916 a(n) is the minimal total number of faces of a polyhedron with at least one i-gonal face for every i in 3..n.
 * @author Georg Fischer
 */
public class A343916 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A343916() {
    super(3, "[[0],[1],[-3],[4],[-4],[3],[-1]]", "4, 5, 6, 7, 8, 10, 11, 14, 16, 19, 23, 26, 31, 36, 41, 47, 54", 0);
  }
}
