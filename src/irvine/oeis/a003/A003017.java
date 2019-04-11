package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003017 Expansion of <code>1/(1 -</code> x*exp(x) + x^2*exp(2*x) - x^3*exp(3*x)).
 * @author Sean A. Irvine
 */
public class A003017 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> B = RING.multiply(RING.x(), Q.TWO);
  private static final Polynomial<Q> C = RING.multiply(RING.x(), Q.THREE);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> a = RING.exp(RING.x(), mN).shift(1);
    final Polynomial<Q> b = RING.exp(B, mN).shift(2);
    final Polynomial<Q> c = RING.exp(C, mN).shift(3);
    final Polynomial<Q> d = RING.subtract(RING.add(RING.subtract(RING.one(), a), b), c);
    return RING.coeff(RING.one(), d, mN).multiply(mF).toZ();
  }
}
