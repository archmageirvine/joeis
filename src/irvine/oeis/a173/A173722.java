package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173722 Partial sums of <code>round(n^2/8)</code>.
 * @author Sean A. Irvine
 */
public class A173722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173722() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {0, 0, 1, 2, 4, 7, 12});
  }
}
