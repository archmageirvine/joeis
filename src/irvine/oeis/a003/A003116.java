package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003116 Expansion of the reciprocal of the g.f. defining A039924.
 * @author Sean A. Irvine
 */
public class A003116 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private int mLast = 0;
  private Polynomial<Q> mGF = RING.one();

  @Override
  public Z next() {
    ++mN;
    if (mN > 0 && Functions.SQRT.i(mN) >= mLast) {
      mGF = RING.one();
      Polynomial<Q> den = RING.one();
      ++mLast;
      for (int k = 1; k <= mLast; ++k) {
        den = RING.multiply(den, RING.oneMinusXToTheN(k));
        mGF = RING.signedAdd((k & 1) == 0, mGF, RING.series(RING.monomial(Q.ONE, k * k), den, mLast * mLast));
      }
      mGF = RING.series(RING.one(), mGF, mLast * mLast);
      //System.out.println(mGF);
    }
    return mGF.coeff(mN).toZ();
  }
}
