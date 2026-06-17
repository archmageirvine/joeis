package irvine.oeis.a395;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395726 allocated for Mikhail Kurkov.
 * @author Sean A. Irvine
 */
public class A395726 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (m == 0) {
        return Z.ZERO;
      }
      final long k = (Functions.SQRT.l(8 * m - 7) + 1) / 2;
      return get(n, m - k).add(get(n - 1, m).multiply(k));
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
