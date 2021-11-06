package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A052320 Number of labeled trimmed trees with n nodes.
 * @author Sean A. Irvine
 */
public class A052320 extends A052318 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mB = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mB.add(Q.ZERO);
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    mB.add(new Q(super.next(), mF));
    if (mN <= 2) {
      return Z.ONE; // avoid need for "corrections" to e.g.f.
    } else if (mN == 3) {
      return Z.ZERO;
    } else if (mN == 4) {
      return Z.FOUR;
    } else {
      final Q t = mB.get(mN).subtract(RING.pow(mB, 2, mN).coeff(mN).divide(2));
      return t.multiply(mF).toZ();
    }
  }
}
