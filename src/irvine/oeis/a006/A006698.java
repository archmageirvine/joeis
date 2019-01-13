package irvine.oeis.a006;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006698.
 * @author Sean A. Irvine
 */
public class A006698 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = start();

  @Override
  protected Z compute(final Long k, final Long m) {
    if (m <= k) {
      return Z.ONE;
    }
    final long n = m / k;
    Z sum = Z.ZERO;
    for (long i = 1; i <= n; ++i) {
      sum = sum.add(Binomial.binomial(m - 1, k * i - 1).multiply(i).multiply(get(k, k * i - 1)).multiply(get(k, m - k * i)));
    }
    if (n * k != m) {
      sum = sum.add(get(k, m - 1).multiply(n + 1));
    }
    return sum;
  }

  protected long start() {
    return -m();
  }

  protected long m() {
    return 2;
  }

  @Override
  public Z next() {
    mN += m();
    return get(m(), mN);
  }
}
