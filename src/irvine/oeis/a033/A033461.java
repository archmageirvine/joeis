package irvine.oeis.a033;

import irvine.math.LongUtils;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033461 Number of partitions of n into distinct squares.
 * @author Sean A. Irvine
 */
public class A033461 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 1) {
      return Z.ZERO;
    }
    return get(n, m - 1).add(m * m > n ? Z.ZERO : get(n - m * m, m - 1));
  }

  @Override
  public Z next() {
    return get(++mN, LongUtils.sqrt(mN));
  }
}

