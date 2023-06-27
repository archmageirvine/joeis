package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047362 Numbers that are congruent to {2, 3, 4, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047362() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 4, 5, 9});
  }
}
