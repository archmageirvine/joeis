package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093916 a(2*k-1) = (2*k-1)^2 + 2 - k, a(2*k) = 6*k^2 + 2 - k: First column of the triangle A093915.
 * @author Sean A. Irvine
 */
public class A093916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093916() {
    super(1, new long[] {1, 0, -3, 0, 3, 0}, new long[] {2, 7, 9, 24, 24, 53});
  }
}
