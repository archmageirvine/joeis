package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002315 NSW numbers: <code>a(n) = 6*a(n-1) - a(n-2)</code>; also <code>a(n)^2 - 2*b(n)^2 = -1</code> with b(n)=A001653(n+1).
 * @author Sean A. Irvine
 */
public class A002315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002315() {
    super(new long[] {-1, 6}, new long[] {1, 7});
  }
}
