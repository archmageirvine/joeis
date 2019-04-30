package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244310 <code>a(n) = L(n)^3 - L(n)^2</code>, where <code>L(n)</code> is the n-th Lucas number (A000032).
 * @author Sean A. Irvine
 */
public class A244310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244310() {
    super(new long[] {-1, -1, 14, -4, -22, 2, 5}, new long[] {4, 0, 18, 48, 294, 1210, 5508});
  }
}
