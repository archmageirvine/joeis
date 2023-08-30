package irvine.oeis.a065;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065329 Square array read by antidiagonals giving number of binary trees of height n with k points on the n-th level (n,k&gt;0).
 * @author Sean A. Irvine
 */
public class A065329 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 1) {
        return m == 1 ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = (m + 1) / 2; j <= n * (n + 1); ++j) {
        sum = sum.add(Binomial.binomial(2L * j, m).multiply(get(n - 1, j)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM + 1, mN - mM);
  }
}
