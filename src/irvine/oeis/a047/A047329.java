package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047329 Numbers that are congruent to {1, 3, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047329() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 3, 5, 6, 8});
  }
}
