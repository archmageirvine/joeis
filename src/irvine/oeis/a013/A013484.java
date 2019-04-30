package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013484 <code>arcsin(cos(x)-sech(x))=-4/4!*x^4+60/6!*x^6-1384/8!*x^8+50520/10!*x^10</code>...
 * @author Sean A. Irvine
 */
public class A013484 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 2;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.asin(RING.subtract(RING.cos(RING.x(), mN), RING.sech(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
