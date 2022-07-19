package irvine.oeis.a350;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350286 Number of different ways to partition the set of vertices of a convex (n+11)-gon into 4 nonintersecting polygons.
 * @author Georg Fischer
 */
public class A350286 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350286() {
    super(0, "[[0],[[-22,-13,-1],[-8, 7, 1]]", "0, 55", 0);
  }
}
