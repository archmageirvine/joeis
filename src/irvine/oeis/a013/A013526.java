package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013526 Numerator of <code>[x^(2n)]</code> of the Taylor expansion cosh(cosec(x)-cot(x))=1 <code>+x^2/8 +3*x^4/128 +59*x^6/15360 +871*x^8/1474560 +...</code>.
 * @author Sean A. Irvine
 */
public class A013526 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.multiply(RING.x(), Q.HALF);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.cos(RING.tanh(X2, mN), mN).coeff(mN).abs().num();
  }
}
