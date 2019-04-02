package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173691 Partial sums of round(n^2/6).
 * @author Sean A. Irvine
 */
public class A173691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173691() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 1, -3, 3}, new long[] {0, 0, 1, 3, 6, 10, 16, 24, 35});
  }
}
