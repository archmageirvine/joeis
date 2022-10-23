package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052842 E.g.f. A(x) = series reversion of (1-x)*(1-exp(-x)).
 * @author Sean A. Irvine
 */
public class A052842 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.add(Q.ZERO);
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    mA = RING.negate(RING.log1p(RING.negate(RING.series(RING.x(), RING.subtract(RING.one(), mA), mN)), mN));
    return mA.coeff(mN).multiply(mF).toZ();
  }
}
