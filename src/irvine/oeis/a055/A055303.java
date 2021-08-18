package irvine.oeis.a055;
// manually holos 2021-08-17

import irvine.oeis.HolonomicRecurrence;

/**
 * A055303 Number of labeled rooted trees with n nodes and 2 leaves.
 * Recurrnce: (n-1)*a(n)-(n^2-n)*a(n-1) = 0
 * @author Georg Fischer
 */
public class A055303 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055303() {
    super(3, "[[0],[0, 1,-1],[-3, 1]]", "3", 0);
  }
}
