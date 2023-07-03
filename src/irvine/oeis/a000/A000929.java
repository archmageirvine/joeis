package irvine.oeis.a000;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A000929 Dimension of n-th degree part of Steenrod algebra.
 * @author Sean A. Irvine
 */
public class A000929 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long k) {
    return k > n ? n == 0 ? Z.ONE : Z.ZERO : get(n - k, k).add(get(n, 2 * k + 1));
  }

  @Override
  public Z next() {
    return get(++mN, 1L);
  }

}
