package irvine.oeis.a047;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A047870 Smallest number that is not a sum of at most one power of each of the numbers 1 through n.
 * @author Sean A. Irvine
 */
public class A047870 extends MemoryFunction2Sequence<Long, Boolean> {

  private int mN = 0;
  private long mM = 1;

  @Override
  protected Boolean compute(final Long m, final Long k) {
    if (m == 0) {
      return Boolean.TRUE;
    }
    for (long u = 1; u <= m; u *= k) {
      final long r = m - u;
      for (long v = k + 1; v <= mN; ++v) {
        if (get(r, v)) {
          return Boolean.TRUE;
        }
      }
    }
    return Boolean.FALSE;
  }

  private boolean isSolvable(final long m) {
    // Handle 1
    return get(m, 2L) || get(m - 1, 2L);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    clear(); // cached values depend on mN
    while (isSolvable(mM)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

