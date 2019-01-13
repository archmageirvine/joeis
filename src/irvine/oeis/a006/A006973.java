package irvine.oeis.a006;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006973.
 * @author Sean A. Irvine
 */
public class A006973 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private static final Polynomial<Q> X1 = RING.oneMinusXToTheN(1);
  private Z mF = Z.ONE;
  private int mN = 0;
  private Polynomial<Q> mDen = RING.one();

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Q c = RING.coeff(RING.exp(NEG_X, mN), RING.multiply(X1, mDen), mN);
    mDen = RING.multiply(mDen, RING.onePlusXToTheN(c, mN));
    return c.multiply(mF).toZ();
  }
}
