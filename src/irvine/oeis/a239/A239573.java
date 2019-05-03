package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239573 Number of <code>non-equivalent (mod D_3)</code> ways to place 3 indistinguishable points on a triangular grid of side n so that no two of them are adjacent.
 * @author Sean A. Irvine
 */
public class A239573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239573() {
    super(new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {0, 1, 6, 32, 113, 329, 790, 1702, 3320, 6057, 10400, 17074});
  }
}
