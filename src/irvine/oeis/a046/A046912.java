package irvine.oeis.a046;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000798;

/**
 * A046912 Number of irreducible quasiorders with n labeled points.
 * @author Sean A. Irvine
 */
public class A046912 extends A000798 {

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
    if (mN <= 1) {
      return Z.ONE;
    }
    return RING.coeff(RING.one(), mA, mN).multiply(mF).toZ().negate();
  }
}
