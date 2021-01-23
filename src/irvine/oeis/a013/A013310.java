package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013310 sin(exp(x)-cos(x))=x+2/2!*x^2-12/4!*x^4-68/5!*x^5-208/6!*x^6...
 * @author Sean A. Irvine
 */
public class A013310 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return RING.sin(RING.subtract(RING.exp(RING.x(), mN), RING.cos(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
