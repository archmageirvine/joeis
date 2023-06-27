package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047581 Numbers that are congruent to {0, 1, 2, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047581() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 5, 6, 7, 8});
  }
}
