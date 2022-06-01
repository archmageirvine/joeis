package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167534 a(n) = 79*n - a(n-1) for n&gt;0, a(0)=9.
 * @author Sean A. Irvine
 */
public class A167534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167534() {
    super(new long[] {-1, 1, 1}, new long[] {9, 70, 88});
  }
}
