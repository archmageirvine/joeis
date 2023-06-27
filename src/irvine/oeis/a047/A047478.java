package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047478 Numbers that are congruent to {1, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047478() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 5, 7, 9});
  }
}
