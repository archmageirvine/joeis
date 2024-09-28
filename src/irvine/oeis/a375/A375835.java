package irvine.oeis.a375;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A375837.
 * @author Sean A. Irvine
 */
public class A375835 extends Sequence0 {

  private int mN = -1;
  private int mK = 0;

  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int k, final int t) {
      if (k < 0) {
        return Z.ZERO;
      }
      if (k == 0 && n == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(k, n - t, v -> (k == 1 ? Z.ONE : get(v, k - 1, 1)).multiply(Functions.STIRLING1.z(n, v).abs()));
    }
  };

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return mB.get(mN, mK, 0);
  }
}
