package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167534 <code>a(n) = 79*n - a(n-1)</code> for <code>n&gt;0, a(0)=9</code>.
 * @author Sean A. Irvine
 */
public class A167534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167534() {
    super(new long[] {-1, 1, 1}, new long[] {9, 70, 88});
  }
}
