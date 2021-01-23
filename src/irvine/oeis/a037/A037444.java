package irvine.oeis.a037;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037444 Number of partitions of n^2 into squares.
 * @author Sean A. Irvine
 */
public class A037444 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0 || m == 1) {
      return Z.ONE;
    }
    final Z t = get(n, m - 1);
    return m * m > n ? t : t.add(get(n - m * m, m));
  }

  @Override
  public Z next() {
    return get(++mN * mN, mN);
  }
}
