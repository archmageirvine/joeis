package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047486 Numbers that are congruent to {0, 1, 3, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047486() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 3, 5, 7, 8});
  }
}
