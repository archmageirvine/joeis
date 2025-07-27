package irvine.oeis.a078;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078990 Triangle arising from (4,2) tennis ball problem, read by rows.
 * @author Sean A. Irvine
 */
public class A078990 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m > 2 * n) {
        return Z.ZERO;
      }
      if (n < 1) {
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      return Integers.SINGLETON.sum(0, m, k -> get(n - 1, m - k).multiply(k + 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
