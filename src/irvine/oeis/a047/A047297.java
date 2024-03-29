package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047297 Numbers that are congruent to {0, 3, 4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047297() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 3, 4, 6, 7});
  }
}
