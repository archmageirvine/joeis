package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005465.
 * @author Sean A. Irvine
 */
public class A005465 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.NEG_ONE, Q.TWO));
  private static final Polynomial<Q> X3 = RING.monomial(Q.THREE, 1);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.subtract(RING.exp(RING.add(RING.exp(RING.x(), mN), A), mN), RING.exp(X3, mN)).coeff(mN).multiply(mF).toZ();
  }
}
