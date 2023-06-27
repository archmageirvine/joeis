package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047612 Numbers that are congruent to {0, 2, 4, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047612() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 4, 5, 8});
  }
}
