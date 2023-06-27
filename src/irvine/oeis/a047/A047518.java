package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047518 Numbers that are congruent to {2, 3, 4, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047518() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {2, 3, 4, 6, 7, 10});
  }
}
