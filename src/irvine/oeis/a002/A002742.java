package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A002742 Logarithmic numbers.
 * @author Sean A. Irvine
 */
public class A002742 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X2 = RING.monomial(Q.NEG_ONE, 2);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> egf = RING.multiply(RING.log1p(NEG_X2, mN), RING.exp(NEG_X, mN), mN);
    return egf.coeff(mN).multiply(mF).toZ().negate();
  }
}
