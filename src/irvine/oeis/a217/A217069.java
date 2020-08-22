package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217069 a(n) = 3*a(n-1) + 24*a(n-2) + a(n-3), with a(0)=0, a(1)=2, and a(2)=7.
 * @author Sean A. Irvine
 */
public class A217069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217069() {
    super(new long[] {1, 24, 3}, new long[] {0, 2, 7});
  }
}
