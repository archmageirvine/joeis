package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047383 Numbers that are congruent to {1, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047383() {
    super(new long[] {-1, 1, 1}, new long[] {1, 5, 8});
  }
}
