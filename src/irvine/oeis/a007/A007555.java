package irvine.oeis.a007;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007555 Number of standard paths of length n in composition poset.
 * @author Sean A. Irvine
 */
public class A007555 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private Z mF = Z.ONE;
  private int mN = -1;

  // compute cosh(x/sqrt(2)) which is rational
  private Polynomial<Q> coshsqrt2(final int n) {
    final Polynomial<Q> cosh = RING.cosh(RING.x(), n);
    // Be naughty and replace directly
    for (int k = 1; 2 * k <= n; ++k) {
      cosh.set(2 * k, cosh.get(2 * k).divide(Z.ONE.shiftLeft(k)));
    }
    return cosh;
  }

  // compute sqrt(2)*sinh(x/sqrt(2)) which is rational
  private Polynomial<Q> sinhsqrt2(final int n) {
    final Polynomial<Q> sinh = RING.sinh(RING.x(), n);
    // Be naughty and replace directly
    for (int k = 1; 2 * k < n; ++k) {
      sinh.set(2 * k + 1, sinh.get(2 * k + 1).divide(Z.ONE.shiftLeft(k)));
    }
    return sinh;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> num = RING.exp(NEG_X, mN);
    final Polynomial<Q> den = RING.subtract(coshsqrt2(mN), sinhsqrt2(mN));
    return RING.coeff(num, RING.pow(den, 2, mN), mN).multiply(mF).toZ();
  }
}
