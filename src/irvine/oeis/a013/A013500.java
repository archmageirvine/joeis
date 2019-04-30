package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013500 Expansion of e.g.f.: <code>log(sec(x)-log(x+1))=-1*x+1/2*x^2+1/3*x^3+3/8*x^4+7/120*x^5-1/240*x^6-593/5040*x^7-37/960*x^8+</code>...
 * @author Sean A. Irvine
 */
public class A013500 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.log(RING.subtract(RING.sec(RING.x(), mN), RING.log1p(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
