package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013285 E.g.f.: <code>arctan(log(x+1)-tanh(x)) = -1/2!*x^2 + 4/3!*x^3 - 6/4!*x^4 + 8/5!*x^5 -</code> ...
 * @author Sean A. Irvine
 */
public class A013285 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return RING.atan(RING.subtract(RING.log1p(RING.x(), mN), RING.tanh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
