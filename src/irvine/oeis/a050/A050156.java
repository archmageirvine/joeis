package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002057;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A050156 T(n,k)=M(2n+3,n+3,k+3), 0&lt;=k&lt;=n, n &gt;= 0, array M as in A050144.
 * @author Sean A. Irvine
 */
public class A050156 extends MemoryFunction2Sequence<Integer, Z> {

  private final MemorySequence mCatalan4 = MemorySequence.cachedSequence(new A002057());
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n < m) {
      return Z.ZERO;
    }
    if (m == 0) {
      return mCatalan4.a(n);
    } else if (m == 1) {
      Z sum = Z.ZERO;
      for (int j = 0; j < n; ++j) {
        sum = sum.add(get(n - 1 - j, 0).multiply(Functions.CATALAN.z((long) (j + 1))));
      }
      return sum;
    } else if (m == 2) {
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
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
