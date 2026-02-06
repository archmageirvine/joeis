package irvine.oeis.a392;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a026.A026794;

/**
 * A392039 Irregular triangle, read by rows: T(n,k) is the unique natural number such that the T(n,k)-th row of A125106 is equivalent to k-th partition of n in A026792.
 * @author Sean A. Irvine
 */
public class A392039 extends A026794 {

  // T(n,k+1) = 2*T(n-m,k-Q(n,m+1)) + 2^(m-1) for Q(n,m+1) < k <= Q(n,m), 1 <= m <= floor(n/2) with T(n,1) = 2^(n-1) where Q(n,k) = Sum_{j=k..floor(n/2)} A026794(n,j).

  private int mN = 1;
  private int mM = 0;

  private int q(final int n, final int k) {
    return Integers.SINGLETON.sum(k, n / 2, j -> get((long) n, (long) j)).intValueExact();
  }

  private final MemoryFunctionInt2<Z> mT = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k1) {
      if (k1 == 1) {
        return Z.ONE.shiftLeft(n - 1);
      }
      final int k = k1 - 1;
      int m = 1;
      while (k > q(n, m) || q(n, m + 1) >= k) {
        if (++m > mN / 2) {
          throw new RuntimeException();
        }
      }
      return get(n - m, k - q(n, m + 1)).multiply2().add(Z.ONE.shiftLeft(m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > Functions.PARTITIONS.l(mN)) {
      ++mN;
      mM = 1;
    }
    return mT.get(mN, mM);
  }
}
