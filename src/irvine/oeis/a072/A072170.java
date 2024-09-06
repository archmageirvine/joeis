package irvine.oeis.a072;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072145.
 * @author Sean A. Irvine
 */
public class A072170 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private int mM = 2;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 0; j < k; ++j) {
        if (n - (j << i) >= 0) {
          sum = sum.add(get(n - (j << i), i - 1, k));
        }
      }
      return sum;
    }
  };

  private Z t(final int n, final int k) {
    return mB.get(n, Functions.DIGIT_LENGTH.i(2, n), k);
  }

  @Override
  public Z next() {
    if (++mM > mN + 2) {
      ++mN;
      mM = 2;
    }
    return t(mN + 2 - mM, mM);
  }
}
