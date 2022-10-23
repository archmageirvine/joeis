package irvine.oeis.a001;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001862 Number of forests of least height with n nodes.
 * @author Sean A. Irvine
 */
public class A001862 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> HALF_X = RING.create(Arrays.asList(Q.ZERO, Q.HALF));
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> exp = RING.subtract(RING.exp(RING.x(), mN), HALF_X);
    return RING.exp(exp.shift(1), mN).coeff(mN).multiply(mF).toZ();
  }
}
