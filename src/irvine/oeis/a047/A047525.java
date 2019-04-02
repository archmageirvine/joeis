package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047525 Numbers that are congruent to {0, 2, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047525() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 7, 8});
  }
}
