package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013528.
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
