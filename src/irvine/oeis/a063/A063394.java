package irvine.oeis.a063;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063394 Border sum triangle, read by rows: Let T(n,0)=T(n,n)=1. In general T(n,m) is the sum of the elements (apart from T(n,m) itself) in the border of the rectangle with vertices T(0,0), T(n-m,0), T(n,m) and T(m,m).
 * @author Sean A. Irvine
 */
public class A063394 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m > n) {
        return Z.ZERO;
      }
      if (m == 0 || m == n) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, m, k -> mB.get(n - k, m - k))
        .add(Integers.SINGLETON.sum(1, n - m, k -> mB.get(n - k, m)))
        .add(Integers.SINGLETON.sum(1, n - m, k -> mB.get(n - m - k, 0)))
        .add(Integers.SINGLETON.sum(1, m - 1, k -> mB.get(k, k)));
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
