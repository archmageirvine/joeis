package irvine.oeis.a002;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A002402 Coefficients for step-by-step integration.
 * @author Sean A. Irvine
 */
public class A002402 extends A002398 {

  private int mN = 0;

  Z alefStar(final int n) {
    Polynomial<Z> a = RING.one();
    for (int i = 0; i < n; ++i) {
      a = RING.multiply(a, Polynomial.create(i, 1));
    }
    Z x = Z.ZERO;
    for (int d = 0; d <= a.degree(); ++d) {
      final Z b = a.coeff(d);
      if (!Z.ZERO.equals(b)) {
        x = x.signedAdd((d & 1) == 0, b.multiply(l(n).divide(d + 1)));
      }
    }
    return x;
  }

  Z deltaStar(final int p, final int j) {
    Z sum = Z.ZERO;
    for (int k = p; k <= j; ++k) {
      sum = sum.add(gamma(p, k).multiply(bigA(k, j)).multiply(alefStar(k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return deltaStar(1, ++mN);
  }
}

