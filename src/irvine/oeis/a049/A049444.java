package irvine.oeis.a049;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A049444 Generalized Stirling number triangle of first kind.
 * @author Sean A. Irvine
 */
public class A049444 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  protected long add() {
    return 1;
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < m || m < 0) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    return get(n - 1, m - 1).subtract(get(n - 1, m).multiply(n + add()));
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
