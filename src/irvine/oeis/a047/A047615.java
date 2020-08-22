package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047615 Numbers that are congruent to {0, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047615() {
    super(new long[] {-1, 1, 1}, new long[] {0, 5, 8});
  }
}
