package irvine.oeis.a035;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A035087 Number of labeled rooted polygonal cacti (Husimi graphs) with n nodes.
 * @author Sean A. Irvine
 */
public class A035087 extends AbstractSequence {

  /* Construct the sequence. */
  public A035087() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C2 = RING.monomial(Q.TWO, 0);
  private Polynomial<Q> mEgf = RING.x();
  private Z mF = Z.ONE;
  protected int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mEgf = RING.exp(RING.series(RING.pow(mEgf, 2, mN), RING.subtract(C2, RING.multiply(mEgf, Q.TWO)), mN), mN).shift(1);
    return mEgf.coeff(mN).multiply(mF).toZ();
  }
}
