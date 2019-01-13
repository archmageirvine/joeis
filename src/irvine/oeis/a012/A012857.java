package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012857.
 * @author Sean A. Irvine
 */
public class A012857 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return select(Q.ZERO);
    }
    return select(RING.log(RING.multiply(RING.xcsc(RING.x(), mN + 1), RING.atan(RING.x(), mN + 1), mN + 1).shift(-1), mN).coeff(mN));
  }
}
