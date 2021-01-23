package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062728 Second 11-gonal (or hendecagonal) numbers: a(n) = n*(9*n+7)/2.
 * @author Sean A. Irvine
 */
public class A062728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062728() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 25});
  }
}
