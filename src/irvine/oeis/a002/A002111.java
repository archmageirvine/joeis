package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002111.
 * @author Sean A. Irvine
 */
public class A002111 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.monomial(new Q(3, 2), 0);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN + 1);
    final Polynomial<Q> den = RING.add(RING.one(), RING.multiply(RING.cos(RING.x(), mN), Q.TWO));
    return RING.coeff(NUM, den, mN).multiply(mF).toZ().abs();
  }
}
