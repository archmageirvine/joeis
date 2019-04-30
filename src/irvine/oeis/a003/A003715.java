package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003715 E.g.f. <code>sin(sin(sin(x)))</code> (odd powers only).
 * @author Sean A. Irvine
 */
public class A003715 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    final Polynomial<Q> gf = RING.sin(RING.sin(RING.sin(RING.x(), mN), mN), mN);
    return gf.coeff(mN).multiply(mF).toZ();
  }
}
