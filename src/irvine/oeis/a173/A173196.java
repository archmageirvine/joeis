package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173196 Partial sums of A002620.
 * @author Sean A. Irvine
 */
public class A173196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173196() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 1, 3, 7});
  }
}
