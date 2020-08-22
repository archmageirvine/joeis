package irvine.oeis.a030;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030272 Number of partitions of n^3 into distinct cubes.
 * @author Sean A. Irvine
 */
public class A030272 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    final long t = m * (m + 1);
    if (n > t * t / 4) {
      // n exceeds sum(k^3,k=1..n)
      return Z.ZERO;
    }
    final Z a = get(n, m - 1);
    return m * m * m > n ? a : a.add(get(n - m * m * m, m - 1));
  }

  @Override
  public Z next() {
    return get(++mN * mN * mN, mN);
  }
}
