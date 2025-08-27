package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079784 Triangle read by rows in which the n-th row contains the smallest set of n consecutive numbers such that the r-th number in the n-th row is divisible by n-r+1. The first term of the n-th row must exceed n.
 * @author Sean A. Irvine
 */
public class A079784 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 1 && m == 1) {
        return Z.TWO;
      }
      if (n == 2 && m == 2) {
        return Z.FIVE;
      }
      if (n == 3 && m == 3) {
        return Z.valueOf(11);
      }
      if (n == m) {
        Z res = Z.ONE;
        for (int k = 2; k <= n; ++k) {
          res = res.lcm(k);
        }
        return res.subtract(1);
      }
      return get(n, m + 1).subtract(1);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}

