package irvine.oeis.a100;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A100258 Triangle of coefficients of normalized Legendre polynomials, with increasing exponents.
 * @author Sean A. Irvine
 */
public class A100258 extends Sequence0 {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = null;
  private Polynomial<Q> mB = RING.x();
  private Z mMaxDen = Z.ONE;
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = RING.one();
      return Z.ONE;
    }
    if (++mM > mB.degree()) {
      ++mN;
      final Polynomial<Q> legendreP = RING.multiply(RING.subtract(RING.multiply(mB.shift(1), new Q(2 * mN + 1)), RING.multiply(mA, new Q(mN))), new Q(1, mN + 1));
      mA = mB;
      mB = legendreP;
      mMaxDen = Z.ONE;
      for (final Q coeff : legendreP) {
        mMaxDen = mMaxDen.max(coeff.den());
      }
      mM = 0;
    }
    return mB.coeff(mM).multiply(mMaxDen).toZ();
  }
}
