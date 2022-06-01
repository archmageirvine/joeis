package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047540 Numbers that are congruent to {0, 2, 4, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047540() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 4, 7, 8});
  }
}
