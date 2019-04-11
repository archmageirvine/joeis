package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009014 Expansion of E.g.f.: <code>(1 + x)/(1 + x + x^2/2)</code>.
 * @author Sean A. Irvine
 */
public class A009014 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.coeff(RING.one(), RING.cosh(RING.log1p(RING.x(), mN), mN), mN).multiply(mF).toZ();
  }
}
