package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002017 E.g.f. <code>exp(sin(x))</code>.
 * @author Sean A. Irvine
 */
public class A002017 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.sin(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
