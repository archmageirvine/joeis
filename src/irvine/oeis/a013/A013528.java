package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013528 Numerator of <code>[x^(2n)]</code> of the Taylor series sech(cosec(x)-cot(x)) <code>= 1 -x^2/8 -x^4/128 +x^6/15360 +19*x^8/294912 +25031*x^10/3715891200+</code>... .
 * @author Sean A. Irvine
 */
public class A013528 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.multiply(RING.x(), Q.HALF);
  private int mN = -2;
  private boolean mNegate = true;

  @Override
  public Z next() {
    mN += 2;
    mNegate = !mNegate;
    if (mN == 0) {
      return Z.ONE;
    }
    final Z num = RING.coeff(RING.one(), RING.cos(RING.tanh(X2, mN), mN), mN).num();
    return mNegate ? num.negate() : num;
  }
}
