package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047537 Numbers that are congruent to {1, 4, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047537() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 7, 9});
  }
}
