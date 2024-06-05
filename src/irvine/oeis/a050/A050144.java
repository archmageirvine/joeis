package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A050144 T(n,k) = M(2n-1,n-1,k-1), 0 &lt;= k &lt;= n, n &gt;= 0, where M(p,q,r) is the number of upright paths from (0,0) to (p,p-q) that meet the line y = x-r and do not rise above it.
 * @author Sean A. Irvine
 */
public class A050144 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n < m) {
      return Z.ZERO;
    }
    if (m == 0) {
      return n == 0 ? Z.ZERO : Functions.CATALAN.z((long) (n - 1));
    } else if (m == 1) {
      Z sum = Z.ZERO;
      for (int j = 0; j < n; ++j) {
        sum = sum.add(get(n - 1 - j, 0).multiply(Functions.CATALAN.z((long) (j + 1))));
      }
      return sum;
    } else if (m == 2) {
      Z sum = Z.ZERO;
      for (int j = 0; j <= n; ++j) {
        sum = sum.add(get(n - j, 1).multiply(Functions.CATALAN.z(j)));
      }
      return sum;
    } else {
      Z sum = Z.ZERO;
      for (int j = 0; j < n; ++j) {
        sum = sum.add(get(n - 1 - j, m - 1).multiply(Functions.CATALAN.z((long) (j + 1))));
      }
      return sum;
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
