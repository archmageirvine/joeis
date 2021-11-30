package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052836 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052846 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> exp = RING.exp(RING.x(), mN);
    return RING.multiply(RING.subtract(RING.one(), exp), RING.log1p(RING.subtract(RING.one(), exp), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
