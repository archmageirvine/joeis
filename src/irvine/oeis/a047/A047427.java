package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047427 Numbers that are congruent to {1, 3, 4, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047427() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 3, 4, 5, 6, 9});
  }
}
