package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047311 Numbers that are congruent to {4, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047311() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {4, 5, 6, 11});
  }
}
