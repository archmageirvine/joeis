package irvine.oeis.a082;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082649 Triangle of coefficients in expansion of sinh^2(n*x) in powers of sinh(x).
 * @author Sean A. Irvine
 */
public class A082649 extends Sequence1 {

  private static final PolynomialRingField<Q> INNER = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final SeriesRing<Polynomial<Q>> RING = new SeriesRing<>(INNER);
  private int mN = 0;
  private int mM = -1;
  private final Series<Polynomial<Q>> mGf = RING.divide(
    RING.onePlusXToTheN(INNER.x(), 1),
    RING.multiply(RING.oneMinusXToTheN(INNER.x(), 1), RING.create(INNER.one(), Polynomial.create(new Q(-4), new Q(-2)), INNER.monomial(Q.ONE, 2)))
  );

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mGf.coeff(mN).coeff(mM).toZ();
  }
}
