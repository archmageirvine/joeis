package irvine.oeis.a035;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035086.
 * @author Sean A. Irvine
 */
public class A035086 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C2 = RING.monomial(Q.TWO, 0);
  private Polynomial<Q> mEgf = RING.x();
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mEgf = RING.integrate(RING.exp(RING.series(RING.pow(mEgf, 2, mN), RING.subtract(C2, RING.multiply(mEgf, Q.TWO)), mN), mN));
    return mEgf.coeff(mN).multiply(mF).toZ();
  }
}
