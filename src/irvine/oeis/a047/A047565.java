package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047565 Numbers that are congruent to {0, 1, 3, 4, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047565() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 4, 5, 6, 7, 8});
  }
}
