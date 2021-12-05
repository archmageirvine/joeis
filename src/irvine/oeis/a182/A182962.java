package irvine.oeis.a182;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052829 A(x) = exp( x/(1 - x*A'(x)/A(x)) ).
 * @author Sean A. Irvine
 */
public class A182962 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;
  private Polynomial<Q> mA = RING.one();

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
      mA = RING.exp(RING.series(RING.x(), RING.subtract(RING.one(), RING.series(RING.diff(mA).shift(1), mA, mN)), mN), mN);
    }
    return mA.coeff(mN).multiply(mF).toZ();
  }
}

