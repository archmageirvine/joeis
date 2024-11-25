package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073345 Table T(n,k), read by ascending antidiagonals, giving the number of rooted plane binary trees of size n and height k.
 * @author Sean A. Irvine
 */
public class A073345 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0 && m == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 0; k < m; ++k) {
        Z s = Z.ZERO;
        for (int j = 0; j <= n - 2; ++j) {
          s = s.add(get(j, k));
        }
        sum = sum.add(s.multiply2().add(get(n - 1, k)).multiply(get(n - 1, m - 1 - k)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, mN - mM);
  }
}

