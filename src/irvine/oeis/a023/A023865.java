package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023865 a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k), where k=floor((n+1)/2) and t(n)=2*n+1 (odd numbers).
 * @author Sean A. Irvine
 */
public class A023865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023865() {
    super(1, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 3, 11, 17, 38, 50, 90});
  }
}
