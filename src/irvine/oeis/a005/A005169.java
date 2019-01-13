package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005169.
 * @author Sean A. Irvine
 */
public class A005169 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long p) {
    if (n == 0) {
      return Z.ONE;
    }
    if (p > n) {
      return Z.ZERO;
    }
    if (p.equals(n)) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (long q = 1; q <= p + 1; ++q) {
      s = s.add(get(n - p, q));
    }
    return s;
  }

  @Override
  public Z next() {
    return get(++mN, 1L);
  }
}

