package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058092 McKay-Thompson series of class 9a for the Monster group.
 * @author Sean A. Irvine
 */
public class A058092 implements Sequence {

  protected  static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X3 = RING.monomial(Q.ONE, 3);
  private static final Q Q27 = new Q(27);
  protected int mN = -1;
  protected Polynomial<Q> mGf = null;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> a = RING.pow(RING.series(RING.eta(X3, mN), RING.eta(RING.x(), mN), mN), 12, mN);
    final Polynomial<Q> t = RING.series(RING.pow(RING.add(RING.one(), RING.multiply(a.shift(1), Q27)), 2, mN), a, mN);
    mGf = PolynomialUtils.cubeRootP(RING.subtract(t, RING.one()), mN);
    return mGf.coeff(mN).toZ();
  }
}
