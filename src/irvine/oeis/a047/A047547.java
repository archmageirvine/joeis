package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047547 Numbers that are congruent to {0, 2, 3, 4, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047547() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 3, 4, 7, 8});
  }
}
