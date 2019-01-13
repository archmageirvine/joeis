package irvine.oeis.a049;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049224.
 * @author Sean A. Irvine
 */
public class A049224 extends MemoryFunction2<Long, Z> implements Sequence {

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < m || m == 0) {
      return Z.ZERO;
    }
    if (n == 1 && m == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(6 * (n - 1) - m).multiply(6).add(get(n - 1, m - 1).multiply(m)).divide(n);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
