package irvine.oeis.a319;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A319318 Number of integer partitions of n such that every distinct submultiset has a different GCD.
 * @author Sean A. Irvine
 */
public class A319318 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m > n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ZERO;
      }
      return get(n - 1, m).add(get(n - 1, m - 1)).add(get(n - 2, m - 1)).add(1);
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
