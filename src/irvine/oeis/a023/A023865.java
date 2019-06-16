package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023865 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2)</code> and <code>t(n)=2*n+1</code> (odd numbers).
 * @author Sean A. Irvine
 */
public class A023865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023865() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 3, 11, 17, 38, 50, 90});
  }
}
