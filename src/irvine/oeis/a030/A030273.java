package irvine.oeis.a030;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030273 Number of partitions of <code>n^2</code> into distinct squares.
 * @author Sean A. Irvine
 */
public class A030273 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (n > m * (m + 1) * (2 * m + 1) / 6) {
      return Z.ZERO;
    }
    final Z a = get(n, m - 1);
    return m * m > n ? a : a.add(get(n - m * m, m - 1));
  }

  @Override
  public Z next() {
    return get(++mN * mN, mN);
  }
}
