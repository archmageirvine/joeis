package irvine.oeis.a377;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a297.A297008;

/**
 * A377650 Number of edge cuts in the complete tripartite graph K_{n,n,n}.
 * @author Gregory Morse
 */
public class A377650 extends A297008 {
  private int mN = 0;
  private final MemoryFunctionInt3<Z> mConnected = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int k) {
      if (n == 0) {
        return m + k == 1 ? Z.ONE : Z.ZERO;
      }
      Z sum = all(n, m, k);
      for (int i = 1; i <= n; ++i) {
        for (int j = 0; j <= m; ++j) {
          final Z choose = Binomial.binomial(n - 1, i - 1).multiply(Binomial.binomial(m, j));
          for (int l = 0; l <= k; ++l) {
            if (i != n || j != m || l != k) {
              sum = sum.subtract(choose.multiply(Binomial.binomial(k, l)).multiply(get(i, j, l)).multiply(all(n - i, m - j, k - l)));
            }
          }
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    return all(mN, mN, mN).subtract(mConnected.get(mN, mN, mN));
  }
}
