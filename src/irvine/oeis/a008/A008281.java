package irvine.oeis.a008;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A008281 Triangle of Euler-Bernoulli or Entringer numbers read by rows.
 * @author Sean A. Irvine
 */
public class A008281 extends MemoryFunction2Sequence<Long, Z> {

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
