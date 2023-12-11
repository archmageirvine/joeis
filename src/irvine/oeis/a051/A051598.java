package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A051598 Rows of triangle formed using Pascal's rule except begin n-th row with 2*n and end it with 2*n+1.
 * @author Sean A. Irvine
 */
public class A051598 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (m.equals(n)) {
      return Z.valueOf(2 * n + 1);
    }
    if (m == 0) {
      return Z.valueOf(2 * n);
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

