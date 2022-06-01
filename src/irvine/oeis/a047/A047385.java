package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047385 Numbers that are congruent to {2, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047385() {
    super(new long[] {-1, 1, 1}, new long[] {2, 5, 9});
  }
}
