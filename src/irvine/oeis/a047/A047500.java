package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047500 Numbers that are congruent to {0, 3, 4, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047500() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 3, 4, 5, 7, 8});
  }
}
