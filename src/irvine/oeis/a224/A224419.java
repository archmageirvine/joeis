package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224419 Numbers k such that triangular(k) + triangular(2*k) is a square.
 * @author Sean A. Irvine
 */
public class A224419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224419() {
    super(1, new long[] {1, -1, 0, -1442, 1442, 0, 1}, new long[] {0, 1, 25, 216, 1849, 36481, 311904});
  }
}
