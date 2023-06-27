package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047580 Numbers that are congruent to {1, 2, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047580() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 5, 6, 7, 9});
  }
}
