package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047530 Numbers that are congruent to {0, 1, 3, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047530() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 3, 7, 8});
  }
}
