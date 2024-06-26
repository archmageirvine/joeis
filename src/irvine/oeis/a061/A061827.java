package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061827 Number of partitions of n into parts which are the digits of n.
 * @author Sean A. Irvine
 */
public class A061827 extends Sequence1 {

  private int mN = 0;

  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int minPart) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = minPart; k < 10 && k <= n; ++k) {
        if ((m & (1 << k)) != 0) {
          sum = sum.add(get(n - k, m, k));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, Functions.SYNDROME.i(mN), 1);
  }
}

