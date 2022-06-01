package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047476 Numbers that are congruent to {0, 1, 2, 3} mod 8.
 * @author Sean A. Irvine
 */
public class A047476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047476() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 3, 8});
  }
}
