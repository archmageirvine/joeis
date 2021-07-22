package irvine.oeis.a049;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049217 E.g.f.: (arctanh(x))^6/6! (even powers only).
 * @author Sean A. Irvine
 */
public class A049217 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 4;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.pow(RING.atanh(RING.x(), mN), 6, mN).coeff(mN).multiply(mF).toZ().divide(30);
  }
}
