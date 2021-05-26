package irvine.oeis.a047;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047921 Triangle of numbers a(n,k) = number of permutations on n letters containing k 3-sequences (n &gt;= 0, 0&lt;=k&lt;=max(0,n-2)).
 * @author Sean A. Irvine
 */
public class A047921 implements Sequence {

  // todo not working

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  private Z binomial(final int n, final int m) {
    return m >= 0 && m <= n ? Binomial.binomial(n, m) : Z.ZERO;
  }

  private Z a(final int n, final int k) {
    Z sum = Z.ZERO;
    if (n >= k) {
      for (int j = 0; j < k; ++j) {
        //sum = sum.add(binomial(k - 1, j).multiply(binomial(n - k - 1, j + 1)).multiply(mF.factorial(n - j - k - 1)));
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
    Z sum = Z.ZERO;
    for (int k = 0; k <= n - 2; ++k) {
      sum = sum.signedAdd(((k + n) & 1) == 0, binomial(k, m).multiply(a(n, k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
