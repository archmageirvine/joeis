package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a001.A001187;

/**
 * A013922 Number of labeled connected graphs with n nodes and 0 cutpoints (blocks or nonseparable graphs).
 * @author Sean A. Irvine
 */
public class A013922 extends A001187 {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mC = RING.zero();
  protected Z mF = Z.ONE;
  {
    setOffset(1);
    super.next(); /// n == 0
  }

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    mC = RING.add(mC, RING.monomial(new Q(t, mF), mN));
    final Polynomial<Q> xcp = RING.diff(mC).shift(1);
    final Polynomial<Q> rev = RING.reversion(xcp, mN);
    final Polynomial<Q> s = RING.series(RING.x(), rev, mN);
    final Polynomial<Q> bp = RING.log(s, mN);
    final Polynomial<Q> b = RING.integrate(bp);
    return b.coeff(mN).multiply(mF).toZ();
  }
}
