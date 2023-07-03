package irvine.oeis.a054;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000961;

/**
 * A054685 Number of partitions of n into distinct prime powers (1 not considered a power).
 * @author Sean A. Irvine
 */
public class A054685 extends MemoryFunction2Sequence<Integer, Z> {

  private final MemorySequence mPP = MemorySequence.cachedSequence(new A000961());
  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return Z.ONE;
    }
    final int pp = mPP.a(n - 1).intValueExact();
    if (m < pp) {
      return Z.ZERO;
    }
    return get(n + 1, m - pp).add(get(n + 1, m));
  }

  @Override
  public Z next() {
    return get(2, ++mN);
  }
}
