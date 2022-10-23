package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009448 E.g.f. sin(x*exp(x)).
 * @author Sean A. Irvine
 */
public class A009448 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.sin(RING.exp(RING.x(), mN).shift(1), mN).coeff(mN).multiply(mF).toZ();
  }
}
