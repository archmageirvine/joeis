package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000238 Number of oriented trees with n nodes.
 * @author Sean A. Irvine
 */
public class A000238 extends A000151 {

  private Z squareTerm() {
    Z s = Z.ZERO;
    final int n = mN;
    for (int k = 1; k < n; ++k) {
      s = s.add(get(k).multiply(get(n - k)));
    }
    return s;
  }

  @Override
  public Z next() {
    return super.next().subtract(squareTerm());
  }
}
