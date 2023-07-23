package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A052324 Number of increasing rooted trees with a forbidden limb of length 3.
 * @author Sean A. Irvine
 */
public class A052324 extends A052318 {

  {
    setOffset(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X3 = RING.monomial(new Q(1, 6), 3);
  private Polynomial<Q> mA = RING.zero();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    mA = RING.integrate(RING.exp(RING.subtract(mA, X3), mN));
    return mA.coeff(mN).multiply(mF).toZ();
  }
}
