package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047517 Numbers that are congruent to {0, 1, 3, 4, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047517() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 4, 6, 7, 8});
  }
}
