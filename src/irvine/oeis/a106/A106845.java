package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106845 n^2 * (n^3 + 2n^2 + 7n - 2) / 8.
 * @author Sean A. Irvine
 */
public class A106845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106845() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 14, 72, 244, 650});
  }
}
