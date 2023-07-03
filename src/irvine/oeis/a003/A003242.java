package irvine.oeis.a003;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A003242 Number of compositions of n such that no two adjacent parts are equal (Carlitz compositions).
 * @author Sean A. Irvine
 */
public class A003242 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (long j = 1; j <= n; ++j) {
      if (j != m) {
        s = s.add(get(n - j, j <= n - j ? j : 0));
      }
    }
    return s;
  }

  @Override
  public Z next() {
    return get(++mN, 0L);
  }

}
