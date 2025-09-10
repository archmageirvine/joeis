package irvine.oeis.a080;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080248 Stirling-like number triangle defined by sequence A000217.
 * @author Sean A. Irvine
 */
public class A080248 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0 || n == m) {
        return Z.ONE;
      }
      return get(n - 1, m).multiply(Functions.TRIANGULAR.z(m + 1)).add(get(n - 1, m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}

