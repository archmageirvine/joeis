package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036073 Triangle of coefficients arising in calculation of A002872 and A002874 (sorting numbers).
 * @author Sean A. Irvine
 */
public class A036073 implements Sequence {

  private static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> X_RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Polynomial<Q>> Y = X_RING.monomial(Y_RING.x(), 0);
  private static final Polynomial<Polynomial<Q>> XY = Y.shift(1);

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mRow = null;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      mM = Math.min(mN, 1);
      final Polynomial<Polynomial<Q>> e1 = X_RING.subtract(X_RING.exp(X_RING.x(), mN), X_RING.one());
      final Polynomial<Polynomial<Q>> e2 = X_RING.subtract(X_RING.add(X_RING.exp(XY, mN), X_RING.multiply(Y, e1, mN)), X_RING.one());
      final Polynomial<Polynomial<Q>> egf = X_RING.exp(e2, mN);
      mRow = egf.coeff(mN);
    }
    return mRow.get(mM).multiply(mF).toZ();
  }
}
