package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047483 Numbers that are congruent to {0, 1, 2, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047483() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 5, 7, 8});
  }
}
