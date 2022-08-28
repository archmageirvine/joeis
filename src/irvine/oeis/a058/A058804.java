package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A058804 Number of labeled vertically indecomposable lattices with a fixed bottom.
 * @author Sean A. Irvine
 */
public class A058804 extends A058164 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mB = RING.empty();
  private final Polynomial<Q> mC = RING.empty();
  protected int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.ONE;
    }
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    final Q t = new Q(super.next(), mF);
    mB.add(t);
    mC.add(mN > 0 ? t : Q.ZERO);
    return mN <= 1 ? Z.ONE : RING.coeff(mC, mB, mN).multiply(mF).toZ();
  }
}
