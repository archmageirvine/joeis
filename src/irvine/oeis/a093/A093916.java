package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093916 <code>a(2*k-1)=(2*k-1)^2+2-k, a(2*k)=6*k^2+2-k</code>: First column of the triangle A093915.
 * @author Sean A. Irvine
 */
public class A093916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093916() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {2, 7, 9, 24, 24, 53});
  }
}
