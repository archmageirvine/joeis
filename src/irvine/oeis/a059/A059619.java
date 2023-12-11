package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059619 As upper right triangle, number of strongly unimodal partitions of n (strongly unimodal means strictly increasing then strictly decreasing) where initial part is k.
 * @author Sean A. Irvine
 */
public class A059619 extends MemoryFunctionInt2Sequence<Z> {

  private final A059607 mS = new A059607();
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    return mS.get(n, m).add(Integers.SINGLETON.sum(m + 1, n, k -> get(n - m, k)));
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
