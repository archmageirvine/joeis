package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047433 Numbers that are congruent to {2, 4, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047433() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 4, 5, 6, 10});
  }
}
