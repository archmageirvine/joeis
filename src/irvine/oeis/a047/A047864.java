package irvine.oeis.a047;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A047864 Number of labeled bipartite graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A047864 extends A047863 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mB = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mB.add(new Q(super.next(), mF));
    return RING.sqrt(mB, mN).coeff(mN).multiply(mF).toZ();
  }
}

