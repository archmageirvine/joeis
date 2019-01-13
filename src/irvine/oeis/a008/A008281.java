package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008281.
 * @author Sean A. Irvine
 */
public class A008281 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (n == 1 && k == 1) {
      return Z.ONE;
    }
    if (k > n) {
      return Z.ZERO;
    }
    if (n.equals(k)) {
      return get(n, n - 1);
    }
    Z sum = Z.ZERO;
    for (long j = n - k; j < n; ++j) {
      sum = sum.add(get(n - 1, j));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
