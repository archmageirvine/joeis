package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013521 Numerator of [x^(2n)] in the Taylor expansion cos(cosec(x)-cot(x))= 1-x^2/8 -7*x^4/384 -97*x^6/46080 -2063*x^8/10321920 -17803*x^10/1238630400 -....
 * @author Sean A. Irvine
 */
public class A013521 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.multiply(RING.x(), Q.HALF);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.cos(RING.tan(X2, mN + 1), mN).coeff(mN).num();
  }
}
