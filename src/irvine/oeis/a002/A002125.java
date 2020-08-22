package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002125 a(n) = Sum_{k=0..n} f(k)*f(n-k) where f(k) = A002124(k).
 * @author Sean A. Irvine
 */
public class A002125 extends A002124 {

  @Override
  public Z next() {
    super.next();
    Z s = Z.ZERO;
    final int n = size() - 1;
    for (int t = 0; t <= n; ++t) {
      s = s.add(get(t).multiply(get(n - t)));
    }
    return s;
  }
}
