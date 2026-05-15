package irvine.oeis.a084;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084867 Symmetric square table, read by antidiagonals, such that antidiagonal sums form the first row shifted left: T(0,0)=1, T(0,k) = Sum_{m=0..k-1} T(m,k-1-m) when k &gt; 0; and T(n,k) = T(n-1,k) + T(n,k-1) when n &gt; 0, k &gt; 0.
 * @author Sean A. Irvine
 */
public class A084867 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < 0 || m < 0) {
        return Z.ZERO;
      }
      if (m < n) {
        return get(m, n);
      }
      if (n == 0 && m == 0) {
        return Z.ONE;
      }
      if (n == 0) {
        if (m == 1) {
          return Z.ONE;
        }
        return get(0, m - 1).multiply(4).subtract(get(0, m - 2).multiply2());
      }
      return get(n - 1, m).add(get(n, m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM);
  }
}
