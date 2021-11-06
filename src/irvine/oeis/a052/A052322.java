package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A052322 Number of labeled rooted trees with a forbidden limb of length 3.
 * @author Sean A. Irvine
 */
public class A052322 extends A052318 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X3 = RING.monomial(Q.ONE, 3);
  private Polynomial<Q> mA = RING.zero();
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mA = RING.exp(RING.subtract(mA, X3), mN).shift(1);
    return mA.coeff(mN).multiply(mF).toZ();
  }
}
