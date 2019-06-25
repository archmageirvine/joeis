package irvine.oeis.a024;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008284;

/**
 * A024207.
 * @author Sean A. Irvine
 */
public class A024207 extends MemoryFunction2<Long, Z> implements Sequence {

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
