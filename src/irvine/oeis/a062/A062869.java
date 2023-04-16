package irvine.oeis.a062;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062869 Triangle read by rows: For n &gt;= 0, k &gt;= 0, T(n,k) is the number of permutations pi of n such that the total distance Sum_i abs(i-pi(i)) = 2k. Equivalently, k = Sum_i max(i-pi(i),0).
 * @author Sean A. Irvine
 */
public class A062869 extends Sequence0 {

  private static final PolynomialRingField<Q> INNER = new PolynomialRingField<>("t", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>("z", INNER);
  private Polynomial<Q> mRow = INNER.zero();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      ++mN;
      Polynomial<Polynomial<Q>> gf = RING.one();
      for (int k = mN; k > 0; --k) {
        final int a = (k + 1) / 2;
        final int b = k / 2;
        gf = RING.series(RING.one(), RING.subtract(RING.one(), RING.multiply(gf, INNER.monomial(new Q(a), b)).shift(1)), mN);
      }
      mRow = gf.coeff(mN);
      mM = 0;
    }
    return mRow.coeff(mM).toZ();
  }
}
