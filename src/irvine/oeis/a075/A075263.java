package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073101.
 * @author Sean A. Irvine
 */
public class A075263 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mRow = RING.pow(RING.series(NEG_X, RING.log1p(NEG_X, mN), mN), mN, mN);
    }
    return mRow.coeff(mM).multiply(Functions.FACTORIAL.z(mN - 1)).toZ();
  }
}
