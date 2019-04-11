package irvine.oeis.a007;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007695 Cardinalities of Sperner families on <code>1,...,n</code>.
 * @author Sean A. Irvine
 */
public class A007695 extends MemoryFunction3<Long, Z> implements Sequence {

  // E function
  @Override
  protected Z compute(final Long p, final Long n, final Long k) {
    if (k > n || p < 0) {
      return Z.ZERO;
    }
    if (k == -1) {
      return Z.ONE;
    }
    if (k.equals(n)) {
      return Z.ONE;
    }
    if (n.equals(p)) {
      return get(p, p - 1, k);
    }
    Z sum = Z.ZERO;
    for (long i = k; i <= n; ++i) {
      sum = sum.add(get(p - 1, n, i).multiply(get(p - 1, i - 1, k - 1)));
    }
    return sum;
  }

  protected Z f(final long p, final long n) {
    Z sum = Z.ZERO;
    for (long k = -1; k <= n; ++k) {
      sum = sum.add(get(p, n, k));
    }
    return sum;
  }

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, mN);
  }
}
