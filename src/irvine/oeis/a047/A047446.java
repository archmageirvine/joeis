package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047446 Numbers that are congruent to {0, 1, 3, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047446() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 3, 5, 6, 8});
  }
}
