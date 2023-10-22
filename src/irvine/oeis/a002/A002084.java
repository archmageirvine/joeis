package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002084 Sinh(x) / cos(x) = Sum_{n&gt;=0} a(n)*x^(2n+1)/(2n+1)!.
 * @author Sean A. Irvine
 */
public class A002084 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN - 1).multiply(mN);
    }
    final Polynomial<Q> q = RING.series(RING.sinh(RING.x(), mN), RING.cos(RING.x(), mN), mN);
    return q.coeff(mN).multiply(mF).toZ();
  }
}
