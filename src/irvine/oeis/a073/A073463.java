package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073463 Triangle of number of partitions of 2n into powers of 2 where the largest part is 2^k.
 * @author Sean A. Irvine
 */
public class A073463 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return Z.ONE;
      }
      if (n == 0) {
        return Z.ZERO;
      }
      return get(n - 1, m).add(get(n / 2, m - 1));
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
