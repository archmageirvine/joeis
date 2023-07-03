package irvine.oeis.a051;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A051668 Rows of triangle formed using Pascal's rule except begin and end n-th row with (n+1)^2.
 * @author Sean A. Irvine
 */
public class A051668 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (m == 0 || m.equals(n)) {
      return Z.valueOf(n + 1).square();
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
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

