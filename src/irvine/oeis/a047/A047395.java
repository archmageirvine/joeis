package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047395 Numbers that are congruent to {0, 2, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047395() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 2, 6, 8});
  }
}
