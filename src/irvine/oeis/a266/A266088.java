package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266088 Alternating sum of 12-gonal (or dodecagonal) numbers.
 * @author Sean A. Irvine
 */
public class A266088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266088() {
    super(new long[] {1, 2, 0, -2}, new long[] {0, -1, 11, -22});
  }
}
