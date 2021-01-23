package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009097 Expansion of e.g.f. cos(x)*cos(log(1+x)).
 * @author Sean A. Irvine
 */
public class A009097 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.multiply(RING.cos(RING.x(), mN), RING.cos(RING.log1p(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
