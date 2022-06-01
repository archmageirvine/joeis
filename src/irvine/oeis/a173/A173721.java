package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173721 Partial sums of A056833.
 * @author Sean A. Irvine
 */
public class A173721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173721() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 1, -3, 3}, new long[] {0, 0, 1, 2, 4, 8, 13, 20, 29, 41});
  }
}
