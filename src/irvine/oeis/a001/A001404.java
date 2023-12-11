package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A001404 Triangle of values of 2-d recurrence.
 * @author Sean A. Irvine
 */
public class A001404 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mP = 0;

  @Override
  protected Z compute(final Long m, final Long n) {
    if (m == 0 && n == 0) {
      return Z.ONE;
    }
    if (m < n) {
      return Z.ZERO;
    }
    Z s;
    if (n == 0) {
      s = get(m - 1, 0L).add(get(m - 1, 1L));
    } else {
      s = Z.ZERO;
      for (long t = 0; t <= n + 1; ++t) {
        s = s.add(get(m - n, t));
      }
    }
    return s;
  }

  @Override
  public Z next() {
    if (++mP > mN) {
      ++mN;
      mP = 0;
    }
    //System.out.println(mN + " " + mP);
    return get(mN, mP);
  }

}
