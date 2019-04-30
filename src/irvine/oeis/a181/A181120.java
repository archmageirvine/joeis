package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181120 Partial sums of <code>round(n^2/12)</code> (A069905).
 * @author Sean A. Irvine
 */
public class A181120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181120() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 0, 0, 1, 2, 4, 7});
  }
}
