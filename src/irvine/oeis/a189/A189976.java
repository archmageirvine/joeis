package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189976 a(n) is the number of incongruent two-color bracelets of n beads, 8 of them black (A005514), having a diameter of symmetry.
 * @author Sean A. Irvine
 */
public class A189976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189976() {
    super(8, new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {1, 1, 5, 5, 15, 15, 35, 35, 70});
  }
}
