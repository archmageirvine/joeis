package irvine.oeis.a052;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052121 Triangle of coefficients of polynomials enumerating trees with n labeled nodes by inversions.
 * @author Sean A. Irvine
 */
public class A052121 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private Polynomial<Q> mRow = null;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    final int lim = mN == 0 ? 1 : (mN - 1) * (mN - 2) / 2 + 1;
    if (++mM >= lim) {
      // We need to recompute the entire sum with higher degree of expansion
      ++mN;
      final int max = (mN - 1) * (mN - 2) / 2 + 1;
      mM = 0;
      final PolynomialRingField<Q> yRing = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, max);
      final PolynomialRingField<Polynomial<Q>> xRing = new PolynomialRingField<>(yRing);
      final Polynomial<Q> y1 = yRing.create(Arrays.asList(Q.NEG_ONE, Q.ONE));
      Polynomial<Polynomial<Q>> sum = xRing.zero(); // omit 1+ because we want log1p
      for (int k = 1; k <= mN; ++k) {
        final Polynomial<Q> y = yRing.series(yRing.one().shift(k * (k - 1) / 2), yRing.pow(y1, k, max), max);
        sum = xRing.add(sum, xRing.monomial(yRing.divide(y, new Q(mF.factorial(k))), k));
      }
      final Polynomial<Polynomial<Q>> log = xRing.log1p(sum, mN + 1);
      mRow = xRing.multiply(log, y1).coeff(mN);
    }
    return mRow.coeff(mM).multiply(mF.factorial(mN)).toZ();
  }
}
