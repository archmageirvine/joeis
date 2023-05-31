package irvine.oeis.a063;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063978 Sum_{i for which n - i*(i-1)/2 &gt;= 0} binomial (n - i*(i-1)/2, i).
 * @author Sean A. Irvine
 */
public class A063978 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(m, n, k -> get(n - k, m + 1));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}
