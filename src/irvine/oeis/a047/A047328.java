package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047328 Numbers that are congruent to {0, 3, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047328() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 3, 5, 6, 7});
  }
}
