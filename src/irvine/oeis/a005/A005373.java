package irvine.oeis.a005;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005373 A class of rooted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005373 extends MemoryFunction3<Long, Z> implements Sequence {

  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long m, final Long p) {
    if (n == 1) {
      return m == 0 && p == 0 ? Z.ONE : Z.ZERO;
    }
    Z v = Z.ZERO;
    if (p > 0) {
      v = v.add(get(n - 1, m, p - 1).multiply(2 * n - 2 * m - p - 2))
        .add(get(n - 1, m, p - 1).multiply(n - m - p));
    }
    if (m > 0) {
      v = v.add(get(n - 1, m - 1, p).multiply(n - 2 * m - p))
        .add(get(n - 1, m - 1, p + 1).multiply(p + 1));
    }
    final long u = 2 * n - 2 * m - p - 3;
    if (u > 0) {
      v = v.add(get(n - 1, m, p).multiply(u));
    }
    return v;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m <= mN; ++m) {
      for (long p = 0; p + m <= mN; ++p) {
        sum = sum.add(get(mN, m, p));
      }
    }
    return sum;
  }
}
