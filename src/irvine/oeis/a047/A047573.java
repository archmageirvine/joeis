package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047573 Numbers that are congruent to {0, 1, 2, 4, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047573() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 4, 5, 6, 7, 8});
  }
}
