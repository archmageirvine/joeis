package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047336 Numbers that are congruent to {1, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047336() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 6, 8});
  }
}
