package irvine.oeis.a046;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a001.A001035;

/**
 * A046908 Number of irreducible posets with n labeled points.
 * @author Sean A. Irvine
 */
public class A046908 extends A001035 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA.add(new Q(super.next(), mF));
    if (mN <= 2) {
      return Z.ONE;
    }
    return RING.coeff(RING.one(), mA, mN).multiply(mF).toZ().negate();
  }
}
