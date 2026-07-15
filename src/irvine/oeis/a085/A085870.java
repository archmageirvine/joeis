package irvine.oeis.a085;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085870 Array defined by T(i,1) = 2^i-1, T(1,j) = 2^j-1, T(i,j) = T(i-1,j) + T(i-1,j-1) read by antidiagonals upwards.
 * @author Sean A. Irvine
 */
public class A085870 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.ONE.shiftLeft(n).subtract(1);
      }
      if (n == 1) {
        return Z.ONE.shiftLeft(m).subtract(1);
      }
      return get(n - 1, m).add(get(n - 1, m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM + 1, mM + 1);
  }
}
