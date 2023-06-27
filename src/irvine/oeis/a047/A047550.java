package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047550 Numbers that are congruent to {5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047550() {
    super(1, new long[] {-1, 1, 1}, new long[] {5, 7, 13});
  }
}
