package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059607 As an upper right triangle, number of distinct partitions of n where the highest part is k (0&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A059607 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    return Integers.SINGLETON.sum(0, m - 1, k -> get(n - m, k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
