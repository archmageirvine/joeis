package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106330 Numbers k such that k^2 = 24*(j^2) + 25.
 * @author Sean A. Irvine
 */
public class A106330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106330() {
    super(1, new long[] {-1, 0, 0, 10, 0, 0}, new long[] {5, 7, 11, 25, 59, 103});
  }
}
