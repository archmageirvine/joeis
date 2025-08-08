package irvine.oeis.a078;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.SeriesFactory;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078297 Triangle of numerators of Integral_{x=0..1} LegendreP(m,x) * LegendreP(n,x) dx.
 * @author Sean A. Irvine
 */
public class A078297 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private int mM = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final Polynomial<Q> f = RING.integrate(RING.multiply(SeriesFactory.LEGENDRE_P.s(mN, 0), SeriesFactory.LEGENDRE_P.s(mM, 0)));
    return select(RING.eval(f, Q.ONE).subtract(RING.eval(f, Q.ZERO)));
  }
}

