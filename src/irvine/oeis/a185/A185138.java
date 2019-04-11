package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185138 <code>a(4*n) = n*(4*n-1)</code>; <code>a(2*n+1) = n*(n+1)/2</code>; <code>a(4*n+2) = (2*n+1)*(4*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A185138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185138() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 0, 1, 1, 3, 3, 15, 6, 14, 10, 45, 15});
  }
}
