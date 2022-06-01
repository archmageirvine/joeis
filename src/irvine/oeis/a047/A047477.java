package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047477 Numbers that are congruent to {0, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047477() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 5, 7, 8});
  }
}
