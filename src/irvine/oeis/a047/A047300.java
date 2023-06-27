package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047300 Numbers that are congruent to {2, 3, 4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047300() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 4, 6, 9});
  }
}
