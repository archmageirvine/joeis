package irvine.oeis.a002;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002449 Number of different types of binary trees of height n.
 * @author Sean A. Irvine
 */
public class A002449 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -2;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n <= 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (long j = 1; j <= 2 * k; ++j) {
      s = s.add(get(n - 1, j));
    }
    return s;
  }

  @Override
  public Z next() {
    return get(++mN, 1L);
  }

}
