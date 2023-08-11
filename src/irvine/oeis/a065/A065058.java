package irvine.oeis.a065;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065055.
 * @author Sean A. Irvine
 */
public class A065058 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int i, final int j, final int k) {
      if (j > i || k > j) {
        return Z.ZERO;
      }
      if (k == 0) {
        return Z.ONE;
      }
      return get(i - 1, j, k).add(get(i, j - 1, k)).add(get(i, j, k - 1));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN, mN);
  }
}

