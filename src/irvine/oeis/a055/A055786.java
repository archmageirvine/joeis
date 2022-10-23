package irvine.oeis.a055;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055786 Numerators of Taylor series expansion of arcsin(x). Also arises from arccos(x), arccsc(x), arcsec(x), arcsinh(x).
 * @author Sean A. Irvine
 */
public class A055786 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.asin(RING.x(), mN).coeff(mN));
  }
}
