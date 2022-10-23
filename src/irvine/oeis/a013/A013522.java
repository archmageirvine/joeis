package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013522 Numerator of [x^(2n+1)] in the Taylor expansion sinh(cosec(x)-cotan(x))= x/2 +x^3/16 +37*x^5/3840 +137*x^7/92160 +41641*x^9/185794560 + 3887*x^11/117964800 +...
 * @author Sean A. Irvine
 */
public class A013522 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.multiply(RING.x(), Q.HALF);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.sin(RING.tanh(X2, mN), mN).coeff(mN).abs().num();
  }
}
