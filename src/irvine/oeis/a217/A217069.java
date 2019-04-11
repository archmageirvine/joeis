package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217069 <code>a(n) = 3*a(n-1) + 24*a(n-2) + a(n-3),</code> with <code>a(0)=0, a(1)=2,</code> and <code>a(2)=7</code>.
 * @author Sean A. Irvine
 */
public class A217069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217069() {
    super(new long[] {1, 24, 3}, new long[] {0, 2, 7});
  }
}
