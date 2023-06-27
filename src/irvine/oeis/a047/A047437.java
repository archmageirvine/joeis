package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047437 Numbers that are congruent to {0, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047437() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 5, 6, 8});
  }
}
