package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002628;
import irvine.oeis.memory.MemorySequence;

/**
 * A047921 Triangle of numbers a(n,k) = number of permutations on n letters containing k 3-sequences (n &gt;= 0, 0&lt;=k&lt;=max(0,n-2)).
 * @author Sean A. Irvine
 */
public class A047921 extends Sequence0 {

  private final MemorySequence mCol0 = MemorySequence.cachedSequence(new A002628());
  private int mN = 0;
  private int mM = -1;

  private Z a(final int n, final int k) {
    Z sum = Z.ZERO;
    if (n >= k) {
      for (int j = 0; j < k; ++j) {
        if (n - 2 * k + j >= 0) {
          sum = sum.add(Binomial.binomial(k - 1, j).multiply(Binomial.binomial(n - k - 1, k - j)).multiply(Functions.FACTORIAL.z(n - 2 * k + j)));
        }
      }
    }
    return sum;
  }

  protected Z t(final int n, final int m) {
    if (n < 2) {
      return Z.ONE;
    }
    if (m == 0) {
      return mCol0.a(n);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= n - 2; ++k) {
      sum = sum.signedAdd(((k + n) & 1) == 0, Binomial.binomial(k, m).multiply(a(n, k)));
    }
    return sum.abs();
  }

  @Override
  public Z next() {
    final Z t = t(mN, ++mM);
    if (mN <= 2 || Z.ONE.equals(t)) {
      ++mN;
      mM = -1;
    }
    return t;
  }
}
