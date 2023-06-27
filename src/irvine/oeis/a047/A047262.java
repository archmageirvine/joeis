package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047262 Numbers that are congruent to {0, 2, 4, 5} mod 6.
 * @author Sean A. Irvine
 */
public class A047262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047262() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {0, 2, 4, 5});
  }
}
