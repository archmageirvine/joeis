package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009767 Expansion of tan(tanh(x))*sin(x)/2.
 * @author Sean A. Irvine
 */
public class A009767 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.monomial(Q.ONE, 2);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 4;
    if (mN == 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.tan(X2, mN).coeff(mN).multiply(mF).toZ();
  }
}
