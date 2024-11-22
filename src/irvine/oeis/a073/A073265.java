package irvine.oeis.a073;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073265 Table T(n,k) (listed antidiagonalwise in order T(1,1), T(2,1), T(1,2), T(3,1), T(2,2), ...) giving the number of compositions (ordered partitions) of n into exactly k powers of 2.
 * @author Sean A. Irvine
 */
public class A073265 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m > n) {
        return Z.ZERO;
      }
      if (n == m) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(0, IntegerUtils.floorLog2(n), k -> get(n - (1 << k), m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN - mM + 1, mM);
  }
}
