package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A058559 McKay-Thompson series of class 20d for Monster.
 * @author Sean A. Irvine
 */
public class A058559 extends A058098 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(new Q(super.next()));
    return RING.sqrt(mA, ++mN).coeff(mN).toZ();
  }
}
