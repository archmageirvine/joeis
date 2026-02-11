package irvine.oeis.a392;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392624 Parallelized coupon collector's problem: With n fair n-sided dice, a(n) = numerator(E(n)) where E(n) is the expected number of turns for n coordinating mice to have every face present.
 * @author Sean A. Irvine
 */
public class A392624 extends Sequence1 {

  private int mN = 0;

  private Z rSubset(final int r, final int n, final int k) {
    if (k < r) {
      return Z.ZERO;
    }
    return Integers.SINGLETON.sum(0, k - r, i -> Z.NEG_ONE.pow(k - r - i).multiply(Binomial.binomial(k - r, i)).multiply(Z.valueOf(i + r).pow(n - r))).divide(Functions.FACTORIAL.z(k - r));
  }

  private Q p(final int n, final int m, final int l) {
    return new Q(Functions.FACTORIAL.z(n - m), Z.valueOf(n).pow(n - m).multiply(Functions.FACTORIAL.z(n - l))).multiply(rSubset(m, n, l));
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return select(Q.ONE);
    }
    final Matrix<Q> mat = new DefaultMatrix<>(mN - 1, mN - 1, Q.ZERO);
    for (int l = 1; l < mN; ++l) {
      for (int m = 1; m < mN; ++m) {
        mat.set(l - 1, m - 1, (l == m ? Q.ONE : Q.ZERO).subtract(p(mN, m, l)));
      }
    }
    final Matrix<Q> inv = new MatrixField<>(mN - 1, Rationals.SINGLETON).inverse(mat);
    Q sum = Q.ZERO;
    for (int l = 0; l < inv.rows(); ++l) {
      sum = sum.add(inv.get(l, 0));
    }
    return select(sum);
  }
}
