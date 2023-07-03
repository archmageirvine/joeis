package irvine.oeis.a047;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A047871 a(n) = smallest number &gt; a(n-1) that is not a sum of exactly one power of each of the numbers 1 through n.
 * @author Sean A. Irvine
 */
public class A047871 extends MemoryFunction2Sequence<Long, Boolean> {

  private int mN = -1;
  private long mM = 1;

  @Override
  protected Boolean compute(final Long m, final Long k) {
    if (m == 0) {
      return k == mN + 1;
    }
    if (k <= mN) {
      for (long u = 1; u <= m; u *= k) {
        if (get(m - u, k + 1)) {
          return Boolean.TRUE;
        }
      }
    }
    return Boolean.FALSE;
  }

  private boolean isSolvable(final long m) {
    // Handle 1
    return get(m - 1, 2L);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    clear(); // cached values depend on mN
    while (isSolvable(++mM)) {
      // do nothing
    }
    return Z.valueOf(mM);
  }
}

