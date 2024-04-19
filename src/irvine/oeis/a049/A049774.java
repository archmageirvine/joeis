package irvine.oeis.a049;

import irvine.math.MemoryFunctionInt4;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049774 Number of permutations of n elements not containing the consecutive pattern 123.
 * @author Sean A. Irvine
 */
public class A049774 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int u, final int o, final int t, final int k) {
      if (t == k) {
        return Functions.FACTORIAL.z(u + o);
      }
      if (Math.max(t, u) + o < k) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= o; ++j) {
        sum = sum.add(get(u + j - 1, o - j, t + 1, k));
      }
      for (int j = 1; j <= u; ++j) {
        sum = sum.add(get(u - j, o + j - 1, 1, k));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(0, ++mN, 0, 2).subtract(mB.get(0, mN, 0, 3)).add(1);
  }
}
