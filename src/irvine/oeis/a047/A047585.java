package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047585 Numbers that are congruent to {0, 1, 3, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047585() {
    super(1, new long[] {-1, 2, -2, 2, -2, 2}, new long[] {0, 1, 3, 5, 6, 7});
  }
}
