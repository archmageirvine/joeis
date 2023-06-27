package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047441 Numbers that are congruent to {0, 2, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047441() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 5, 6, 8});
  }
}
