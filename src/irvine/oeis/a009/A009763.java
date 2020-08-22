package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009763 a(n) is (n+1)!*(n+2)! times coefficient of x^n in (log(1-x))^-1.
 * @author Sean A. Irvine
 */
public class A009763 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private int mN = -1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN + 1).multiply(mN + 2);
    return RING.coeff(RING.x(), RING.log1p(NEG_X, mN + 2), mN + 1).multiply(mF).toZ();
  }
}
