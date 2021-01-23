package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013530 Numerator of [x^(2n+1)] of the Taylor expansion sin(cosec(x) - cosech(x)) = x/3 - x^3/162 + 211*x^5/51030 -157*x^7/688905 + 439801*x^9/9821029680 - ...
 * @author Sean A. Irvine
 */
public class A013530 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private boolean mNegate = true;

  @Override
  public Z next() {
    mN += 2;
    mNegate = !mNegate;
    final Z num = RING.exp(RING.subtract(RING.xcsc(RING.x(), mN + 1), RING.xcsch(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
    return mNegate ? num.negate() : num;
  }
}
