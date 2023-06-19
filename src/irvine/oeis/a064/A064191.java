package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064191 Triangle T(n,k) (n &gt;= 0, 0 &lt;= k &lt;= n) generalizing Motzkin numbers.
 * @author Sean A. Irvine
 */
public class A064191 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return n == 0 ? Z.ONE : Integers.SINGLETON.sum(0, n - 1, k -> get(n - 1, k));
      }
      if ((m & 1) == 0) {
        return Integers.SINGLETON.sum(m - 1, n - 1, k -> get(n - 1, k));
      } else {
        return get(n - 1, m - 1);
      }
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

