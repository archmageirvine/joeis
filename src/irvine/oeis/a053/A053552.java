package irvine.oeis.a053;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A053552 E.g.f. is obtained by reversion of e.g.f. for A053549.
 * @author Sean A. Irvine
 */
public class A053552 extends A053549 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;
  {
    next();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA.add(new Q(super.next(), mF));
    return RING.reversion(mA, mN).coeff(mN).multiply(mF).toZ();
  }
}
