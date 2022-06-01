package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174438 Numbers that are congruent to {0, 2, 5, 8} mod 9.
 * @author Sean A. Irvine
 */
public class A174438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174438() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 5, 8, 9});
  }
}
