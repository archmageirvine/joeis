package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A034928 Triangle of ballot numbers.
 * @author Sean A. Irvine
 */
public class A034928 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m == n + 1) {
      return get(n, n);
    }
    Z sum = get(n - 1, m);
    for (long k = 0; k <= m - 2; ++k) {
      sum = sum.add(get(n - 1, k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN + 1) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}

