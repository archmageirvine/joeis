package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047438 Numbers that are congruent to {1, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047438() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 5, 6, 9});
  }
}
