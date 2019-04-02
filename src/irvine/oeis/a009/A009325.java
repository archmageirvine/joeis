package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009325 E.g.f.: Expansion of log(1+log(1+x)^2) = 2*x^2/2! -6*x^3/3! +10*x^4/4! -...
 * @author Sean A. Irvine
 */
public class A009325 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.log1p(RING.pow(RING.log1p(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
