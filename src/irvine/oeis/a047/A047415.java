package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047415 Numbers that are congruent to {1, 3, 4, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047415() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {1, 3, 4, 6});
  }
}
