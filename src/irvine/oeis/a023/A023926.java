package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A023926 Theta series of A*_14 lattice.
 * @author Sean A. Irvine
 */
public class A023926 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = (dimension() & 1) - 2;

  protected int dimension() {
    return 14;
  }

  private Polynomial<Z> f(final int n, final int m) {
    final long[] c = new long[m + 1];
    c[0] = 1;
    for (int k = 1; n * k * k < c.length; ++k) {
      c[n * k * k] = 2;
    }
    Polynomial<Z> sum = RING.pow(Polynomial.create(c), n, m);
    for (int k = 1; k <= (n - 1) / 2; ++k) {
      final int k2 = k * k;
      if (m + 1 - k2 > 0) {
        final long[] t = new long[m + 1 - k2];
        ++t[0];
        for (int u, j = 1; (u = n * j * j + 2 * k * j) < t.length; ++j) {
          ++t[u];
        }
        for (int u, j = 1; (u = n * j * j - 2 * k * j) < t.length; ++j) {
          ++t[u];
        }
        sum = RING.add(sum, RING.multiply(RING.pow(Polynomial.create(t), n, t.length - 1), Z.TWO).shift(k2));
      }
    }
    if ((n & 1) == 0) {
      final int ns4 = (n / 2) * (n / 2);
      if (m + 1 - ns4 > 0) {
        final long[] t = new long[m + 1 - ns4];
        t[0] = 1;
        for (int u, j = 1; (u = n * j * j + n * j) < t.length; ++j) {
          ++t[u];
        }
        for (int u, j = 1; (u = n * j * j - n * j) < t.length; ++j) {
          ++t[u];
        }
        sum = RING.add(sum, RING.pow(Polynomial.create(t), n, t.length - 1).shift(ns4));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    mN += 2 - (dimension() & 1);
    return RING.coeff(f(dimension() + 1, mN), ThetaFunctions.theta3z(mN), mN);
  }
}
