package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013530.
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
