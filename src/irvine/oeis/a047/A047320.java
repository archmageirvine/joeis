package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047320 Numbers that are congruent to {0, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047320() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 5, 6, 7});
  }
}
