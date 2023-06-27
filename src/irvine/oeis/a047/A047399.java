package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047399 Numbers that are congruent to {0, 3, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047399() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 3, 6, 8});
  }
}
