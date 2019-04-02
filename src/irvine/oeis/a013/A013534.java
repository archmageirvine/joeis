package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013534 Numerator of [x^(2n)] in the Taylor expansion cos(cosec(x) - cosech(x)).
 * @author Sean A. Irvine
 */
public class A013534 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.cos(RING.subtract(RING.xcsc(RING.x(), mN + 1), RING.xcsch(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
