package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012303 Expansion of e.g.f. <code>sech(sin(x)*sin(x))</code>, even powers only.
 * @author Sean A. Irvine
 */
public class A012303 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.sech(RING.pow(RING.sin(RING.x(), mN), 2, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
