package irvine.oeis.a394;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394247 allocated for Tanya Khovanova.
 * @author Sean A. Irvine
 */
public class A394247 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int t) {
      if (n == 0) {
        return Z.valueOf(t);
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z max = Z.ZERO;
      for (int j = 0; j <= n / i; ++j) {
        max = max.max(get(n - i * j, i - 1, t + (i == j ? 1 : 0)));
      }
      return max;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN, 0);
  }
}

