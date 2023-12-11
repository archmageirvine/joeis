package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008284;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A024207 Number of terms in n-th derivative of a function composed with itself 7 times.
 * @author Sean A. Irvine
 */
public class A024207 extends MemoryFunction2Sequence<Long, Z> {

  private A008284 mPartitions = new A008284();
  protected long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n <= 1) {
      return Z.ONE;
    }
    if (m == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= n; ++k) {
      sum = sum.add(mPartitions.get(n, k).multiply(get(k, m - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 7L);
  }
}
