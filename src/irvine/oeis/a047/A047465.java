package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047465 Numbers that are congruent to {1, 2, 4} mod 8.
 * @author Sean A. Irvine
 */
public class A047465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047465() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 4, 9});
  }
}
