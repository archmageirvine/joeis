package irvine.oeis.a350;
// manually hygsolve/holos at 2022-07-30 20:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350116 Number of ways to partition the set of vertices of a convex {n+8}-gon into 3 non-intersecting polygons.
 * @author Georg Fischer
 */
public class A350116 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350116() {
    super(0, "[[0],[-8,-9,-1],[-6, 5, 1]]", "0, 12", 0);
  }
}
