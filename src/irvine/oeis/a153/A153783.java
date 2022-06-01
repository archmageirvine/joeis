package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153783 3 times 11-gonal (or hendecagonal) numbers: 3*n*(9*n-7)/2.
 * @author Sean A. Irvine
 */
public class A153783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153783() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 33});
  }
}
