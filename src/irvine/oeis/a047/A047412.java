package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047412 Numbers that are congruent to {0, 1, 2, 4, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047412() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 4, 6, 8});
  }
}
