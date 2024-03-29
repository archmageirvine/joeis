package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a034.A034318;

/**
 * A058598 McKay-Thompson series of class 26a for Monster.
 * @author Sean A. Irvine
 */
public class A058598 extends A034318 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(new Q(super.next().add(++mN == 1 ? 6 : 0)));
    return RING.sqrt(mA, mN).coeff(mN).toZ();
  }
}
