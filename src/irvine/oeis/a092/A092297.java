package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092297 Number of ways of 3-coloring an annulus consisting of n zones joined like a pearl necklace.
 * @author Sean A. Irvine
 */
public class A092297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092297() {
    super(1, new long[] {2, 1}, new long[] {0, 6});
  }
}
