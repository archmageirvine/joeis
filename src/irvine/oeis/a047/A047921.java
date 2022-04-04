package irvine.oeis.a047;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002628;

/**
 * A047921 Triangle of numbers a(n,k) = number of permutations on n letters containing k 3-sequences (n &gt;= 0, 0&lt;=k&lt;=max(0,n-2)).
 * @author Sean A. Irvine
 */
public class A047921 implements Sequence {

  private final MemorySequence mCol0 = MemorySequence.cachedSequence(new A002628());
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = -1;

  private Z binomial(final int n, final int m) {
    return m >= 0 && m <= n ? Binomial.binomial(n, m) : Z.ZERO;
  }

  private Z a(final int n, final int k) {
    Z sum = Z.ZERO;
    if (n >= k) {
      for (int j = 0; j < k; ++j) {
        if (n - 2 * k + j >= 0) {
          sum = sum.add(binomial(k - 1, j).multiply(binomial(n - k - 1, k - j)).multiply(mF.factorial(n - 2 * k + j)));
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
      sum = sum.signedAdd(((k + n) & 1) == 0, binomial(k, m).multiply(a(n, k)));
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
