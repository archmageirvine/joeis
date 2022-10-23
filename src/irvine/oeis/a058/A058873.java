package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058873 Number of 3-colored labeled graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A058873 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mE = RING.empty();
  {
    mE.add(Q.ZERO); // x^0
  }
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Z s = mF.shiftLeft(mN * (mN - 1) / 2);
    mE.add(new Q(Z.ONE, s));
    return RING.pow(mE, 3).coeff(mN).multiply(s).divide(6).toZ();
  }
}
