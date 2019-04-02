package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047534 Numbers that are congruent to {0, 1, 2, 3, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047534() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 7, 8});
  }
}
