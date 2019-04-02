package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009305 Expansion of e.g.f. log(1 + x*cosh(x)).
 * @author Sean A. Irvine
 */
public class A009305 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.log1p(RING.cosh(RING.x(), mN).shift(1), mN).coeff(mN).multiply(mF).toZ();
  }
}
