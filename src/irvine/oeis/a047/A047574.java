package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047574 Numbers that are congruent to {5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047574() {
    super(new long[] {-1, 1, 0, 1}, new long[] {5, 6, 7, 13});
  }
}
