package irvine.oeis.a067;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a064.A064340;
import irvine.oeis.memory.MemorySequence;

/**
 * A067327 Triangle related to generalized Catalan numbers A064340.
 * @author Sean A. Irvine
 */
public class A067327 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A064340());
  private int mN = -1;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return mA.a(n);
      }
      if (m == 1) {
        return mA.a(n).multiply(3);
      }
      return Integers.SINGLETON.sum(m - 1, n - 1, k -> mB.get(n - 1, k)).multiply(4);
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

