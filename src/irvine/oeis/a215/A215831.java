package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215831 a(n) = 3^(-1-floor(n/3))*A215829(n).
 * @author Sean A. Irvine
 */
public class A215831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215831() {
    super(new long[] {1, 0, 0, 105, 0, 0, -33, 0, 0}, new long[] {1, -1, 9, -11, 59, -267, 433, -2041, 9753});
  }
}
