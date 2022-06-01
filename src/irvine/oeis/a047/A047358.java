package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047358 Numbers that are congruent to {2, 3} mod 7.
 * @author Sean A. Irvine
 */
public class A047358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047358() {
    super(new long[] {-1, 1, 1}, new long[] {2, 3, 9});
  }
}
