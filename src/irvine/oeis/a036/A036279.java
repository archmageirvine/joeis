package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036279 Denominators in Taylor series for tan(x).
 * @author Sean A. Irvine
 */
public class A036279 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<Q>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.tan(RING.x(), mN).coeff(mN).den();
  }
}

