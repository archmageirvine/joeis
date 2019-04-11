package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217947 <code>a(n) = (n+1)*(n^3+15*n^2+74*n+132)/12</code>.
 * @author Sean A. Irvine
 */
public class A217947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217947() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {11, 37, 87, 172, 305});
  }
}
