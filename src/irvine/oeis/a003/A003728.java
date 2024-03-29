package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003728 Expansion of e.g.f. log(1+x*cos(x)).
 * @author Sean A. Irvine
 */
public class A003728 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> gf = RING.log1p(RING.cos(RING.x(), mN).shift(1), mN);
    return gf.coeff(mN).multiply(mF).toZ();
  }
}
