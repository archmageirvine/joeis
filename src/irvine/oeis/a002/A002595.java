package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002595 Denominators of Taylor series expansion of arcsin(x). Also arises from arccos(x), arccsc(x), arcsec(x), arcsinh(x).
 * @author Sean A. Irvine
 */
public class A002595 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return RING.asin(RING.x(), mN).coeff(mN).den();
  }
}
