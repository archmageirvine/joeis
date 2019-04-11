package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195605 <code>a(n) = (4*n*(n+2)+(-1)^n+1)/2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A195605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195605() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 7, 18, 31});
  }
}
