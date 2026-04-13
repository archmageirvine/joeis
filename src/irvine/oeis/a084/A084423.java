package irvine.oeis.a084;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084423 Set partitions up to rotations.
 * @author Sean A. Irvine
 */
public class A084423 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int k, final int j) {
      if (k == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int i = 1; i <= k; ++i) {
        final int ii = i;
        sum = sum.add(Binomial.binomial(k - 1, i - 1).multiply(Integers.SINGLETON.sumdiv(j, d -> get(k - ii, j).multiply(Z.valueOf(d).pow(ii - 1)))));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sumdiv(mN, j -> Functions.PHI.z(j).multiply(mB.get(mN / j, j))).divide(mN);
  }
}
