package irvine.oeis.a395;

import irvine.math.LongUtils;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395685 allocated for Alexander Krivilev.
 * @author Sean A. Irvine
 */
public class A395685 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return k == 0 ? Z.ONE : Z.ZERO;
      }
      return get(n - 1, k - 1).multiply(b(n)).add(get(n - 1, k).multiply(n - b(n)));
    }
  };

  private static long b(final long n) {
    return (1L << LongUtils.ceilLog2(n)) - n;
  }

  @Override
  public Z next() {
    if (++mM > mN - LongUtils.ceilLog2(mN + 1)) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
