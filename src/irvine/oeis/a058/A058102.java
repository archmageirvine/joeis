package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a007.A007251;

/**
 * A058102 McKay-Thompson series of class 10a for Monster.
 * @author Sean A. Irvine
 */
public class A058102 extends A007251 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private final Polynomial<Q> mA = RING.empty();

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    mA.add(++mN == 1 ? new Q(16) : new Q(t));
    return RING.sqrt(mA, mN).coeff(mN).toZ();
  }
}
