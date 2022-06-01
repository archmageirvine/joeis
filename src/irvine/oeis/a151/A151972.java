package irvine.oeis.a151;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A151972 Numbers that are congruent to {0, 1, 6, 10} mod 15.
 * @author Sean A. Irvine
 */
public class A151972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151972() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 6, 10, 15});
  }
}
