package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252116 Numbers n such that the pentagonal number P(n) is equal to the sum of the heptagonal numbers H(m), H(m+1) and H(m+2) for some m.
 * @author Sean A. Irvine
 */
public class A252116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252116() {
    super(new long[] {1, -1, -103682, 103682, 1}, new long[] {1283, 60266, 133006667, 6248482130L, 13790397229331L});
  }
}
