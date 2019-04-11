package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099392 <code>a(n) = floor((n^2 - 2*n + 3)/2)</code>.
 * @author Sean A. Irvine
 */
public class A099392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099392() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 1, 3, 5});
  }
}
