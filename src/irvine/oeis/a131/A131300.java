package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131300 a(n) = 3*a(n-1) - 2*a(n-2) - a(n-3) + a(n-4) with n&gt;3, a(0)=1, a(1)=2, a(2)=3, a(3)=7.
 * @author Sean A. Irvine
 */
public class A131300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131300() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 3, 7});
  }
}
