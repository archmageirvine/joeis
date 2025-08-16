package irvine.oeis.a386;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386728 Triangle read by rows: T(n,k) is the denominator of A(n,k), such that A(n,k) satisfies the identity for sums of odd powers: Sum_{k=1..p} k^(2n-1) = 1/(2*n) * Sum_{k=0..n-1} A(n,k) * (p^2+p)^(n-k), for all integers p &gt;= 1.
 * @author Sean A. Irvine
 */
public class A386728 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = 0;
  private int mM = -1;

  protected Z select(final Q n) {
    return n.den();
  }

  private Q t(final int n, final int k) {
    if (n < 0 || k > n) {
      return Q.ZERO;
    }
    if (n == k) {
      return mB.get(2L * n);
    }
    Q sum = Q.ZERO;
    for (int j = 0; j <= n - k; ++j) {
      sum = sum.add(mB.get(n + k + j).multiply(Binomial.binomial(2L * n, n - k - j)).multiply(Binomial.binomial(n - k + j, j)).multiply(n - k - j).divide(n - k + j));
    }
    return sum.multiply(Z.NEG_ONE.pow(n - k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(t(mN, mM));
  }
}
