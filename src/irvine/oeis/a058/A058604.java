package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a112.A112146;

/**
 * A058604 McKay-Thompson series of class 27d for Monster.
 * @author Sean A. Irvine
 */
public class A058604 extends A112146 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(new Q(super.next().add(++mN <= 1 ? (mN == 1 ? 6 : -1) : 0)));
    return PolynomialUtils.cubeRootP(mA, mN).coeff(mN).toZ();
  }
}
