package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036283 Write cosec x = 1/x + Sum e_n x^(2n-1)/(2n-1)!; sequence gives denominators of e_n.
 * @author Sean A. Irvine
 */
public class A036283 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<Q>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 2) {
      mF = mF.multiply((mN - 1) * (long) (mN - 2));
    }
    return RING.xcsc(RING.x(), mN).coeff(mN).multiply(mF).den();
  }
}

