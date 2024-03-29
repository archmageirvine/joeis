package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047613 Numbers that are congruent to {1, 2, 4, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047613() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 4, 5, 9});
  }
}
