package irvine.oeis.a029;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029589 Expansion of <code>(1+sin(x)+sin(x)^2)/(1-sin(x)+sin(x)^2)</code>.
 * @author Sean A. Irvine
 */
public class A029589 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> sin = RING.sin(RING.x(), mN);
    final Polynomial<Q> sin2 = RING.pow(sin, 2, mN);
    final Polynomial<Q> num = RING.add(RING.add(RING.one(), sin), sin2);
    final Polynomial<Q> den = RING.add(RING.subtract(RING.one(), sin), sin2);
    return RING.coeff(num, den, mN).multiply(mF).toZ();
  }
}
