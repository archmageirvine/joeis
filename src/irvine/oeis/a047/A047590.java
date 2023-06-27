package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047590 Numbers that are congruent to {0, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047590() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 6, 7, 8});
  }
}
