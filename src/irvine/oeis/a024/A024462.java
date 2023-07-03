package irvine.oeis.a024;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A024462 Triangle T(n,k) read by rows, arising in enumeration of catafusenes.
 * @author Sean A. Irvine
 */
public class A024462 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (n <= 2) {
      if (n <= 1) {
        return Z.ONE;
      }
      return m == 1 ? Z.TWO : Z.ONE;
    }
    return get(n - 1, m - 1).multiply(3).add(get(n - 1, m));
  }
}
