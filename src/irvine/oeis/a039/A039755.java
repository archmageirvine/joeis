package irvine.oeis.a039;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A039755 Triangle of B-analogs of Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A039755 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n - 1, m - 1).add(get(n - 1, m).multiply(2 * m + 1));
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

