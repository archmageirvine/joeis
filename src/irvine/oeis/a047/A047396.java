package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047396 Numbers that are congruent to {1, 2, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047396() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 6, 9});
  }
}
