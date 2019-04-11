package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013527 Numerator of <code>[x^(2n)]</code> of the Taylor expansion sec(cosec(x)-cot(x)) <code>= 1+ x^2/8 +13*x^4/384 +397*x^6/46080 +4453*x^8/2064384 + </code>... .
 * @author Sean A. Irvine
 */
public class A013527 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.multiply(RING.x(), Q.HALF);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.coeff(RING.one(), RING.cos(RING.tan(X2, mN), mN), mN).num();
  }
}
