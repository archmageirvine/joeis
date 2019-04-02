package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A001927 Number of connected partially ordered sets with n labeled points.
 * @author Sean A. Irvine
 */
public class A001927 extends A001035 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mPosetsEgf = RING.zero();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return super.next();
    }
    mF = mF.multiply(mN);
    mPosetsEgf = RING.add(mPosetsEgf, RING.monomial(new Q(super.next(), mF), mN));
    final Polynomial<Q> egf = RING.log1p(mPosetsEgf, mN);
    //System.out.println(egf);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
