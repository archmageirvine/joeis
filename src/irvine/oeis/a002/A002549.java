package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002549 Numerators of coefficients of log(1+x)/sqrt(1+x).
 * @author Sean A. Irvine
 */
public class A002549 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  protected Q step() {
    ++mN;
    final Polynomial<Q> gf = RING.series(RING.log1p(RING.x(), mN), RING.sqrt1p(RING.x(), mN), mN);
    return gf.coeff(mN).abs();
  }

  @Override
  public Z next() {
    return step().num();
  }
}
