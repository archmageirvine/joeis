package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047301 Numbers that are congruent to {0, 2, 3, 4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047301() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 3, 4, 6, 7});
  }
}
