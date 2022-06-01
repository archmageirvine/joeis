package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047372 Numbers that are congruent to {1, 2, 3, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047372() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 3, 5, 8});
  }
}
