package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189980 <code>a(n)</code> is the number of incongruent two-color bracelets of n beads, 10 from them are black <code>(A005515)</code>, having a diameter of symmetry.
 * @author Sean A. Irvine
 */
public class A189980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189980() {
    super(new long[] {-1, 1, 5, -5, -10, 10, 10, -10, -5, 5, 1}, new long[] {1, 1, 6, 6, 21, 21, 56, 56, 126, 126, 252});
  }
}
