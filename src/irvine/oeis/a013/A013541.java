package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013541 Numerator of the coefficient [x^(2n)] of the Taylor series cos(cosec(x) - coth(x)).
 * @author Sean A. Irvine
 */
public class A013541 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.cos(RING.subtract(RING.xcsc(RING.x(), mN + 1), RING.xcoth(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
