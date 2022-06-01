package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047610 Positive integers that are congruent to {1, 4, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047610() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 5, 9});
  }
}
