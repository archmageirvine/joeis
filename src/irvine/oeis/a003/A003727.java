package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003727 Expansion of e.g.f. exp(x * cosh(x)).
 * @author Sean A. Irvine
 */
public class A003727 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> gf = RING.exp(RING.cosh(RING.x(), mN).shift(1), mN);
    return gf.coeff(mN).multiply(mF).toZ();
  }
}
