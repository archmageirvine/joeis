package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013519 Numerator of [x^(2n+1)] in the Taylor expansion tan(cosec(x)-cot(x)).
 * @author Sean A. Irvine
 */
public class A013519 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.multiply(RING.x(), Q.HALF);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.tan(RING.tan(X2, mN), mN).coeff(mN).num();
  }
}
