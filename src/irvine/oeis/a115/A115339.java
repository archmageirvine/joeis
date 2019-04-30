package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115339 <code>a(2n-1)=F(n+1), a(2n)=L(n)</code>, where <code>F(n)</code> and <code>L(n)</code> are the Fibonacci and the Lucas sequences.
 * @author Sean A. Irvine
 */
public class A115339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115339() {
    super(new long[] {1, 0, 1, 0}, new long[] {1, 1, 2, 3});
  }
}
