package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003709 E.g.f. cos(sin(x)) (even powers only).
 * @author Sean A. Irvine
 */
public class A003709 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    final Polynomial<Q> gf = RING.cos(RING.sin(RING.x(), mN + 1), mN);
    return gf.coeff(mN).multiply(mF).toZ();
  }
}
