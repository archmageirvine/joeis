package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047533 Numbers that are congruent to {1, 2, 3, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047533() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 3, 7, 9});
  }
}
