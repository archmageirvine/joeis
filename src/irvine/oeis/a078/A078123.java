package irvine.oeis.a078;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078123 Square of infinite lower triangular matrix A078122.
 * @author Sean A. Irvine
 */
public class A078123 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mS = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return Integers.SINGLETON.sum(0, n, k -> mB.get(n, k).multiply(mB.get(k, m)));
    }
  };
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return m == 0 || m == n ? Z.ONE : Integers.SINGLETON.sum(0, n - 1, k -> mS.get(n - 1, k).multiply(get(k, m - 1)));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mS.get(mN, mM);
  }
}

