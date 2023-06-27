package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047624 Numbers that are congruent to {0, 1, 3, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047624() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 3, 5, 8});
  }
}
