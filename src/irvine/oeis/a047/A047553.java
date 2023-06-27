package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047553 Numbers that are congruent to {0, 2, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047553() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 6, 7, 8});
  }
}
