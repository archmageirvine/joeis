package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000951 Number of forests with n nodes and height at most 4.
 * @author Sean A. Irvine
 */
public class A000951 extends A000950 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mS = RING.x();

  @Override
  public Z next() {
    mS = RING.add(mS, RING.monomial(super.nextEgf(), mN + 1));
    return RING.exp(mS, mN).coeff(mN).multiply(mF).toZ();
  }
}
