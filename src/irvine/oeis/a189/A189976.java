package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189976 <code>a(n)</code> is the number of incongruent two-color bracelets of n beads, 8 of them black <code>(A005514)</code>, having a diameter of symmetry.
 * @author Sean A. Irvine
 */
public class A189976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189976() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {1, 1, 5, 5, 15, 15, 35, 35, 70});
  }
}
