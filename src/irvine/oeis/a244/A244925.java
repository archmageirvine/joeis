package irvine.oeis.a244;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A244925 Number T(n,k) of n-node unlabeled rooted trees with every leaf at height k; triangle T(n,k), n&gt;=1, 0&lt;=k&lt;=n-1, read by rows.
 * @author Sean A. Irvine
 */
public class A244925 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A244925() {
    super(1);
  }

  // After Alois P. Heinz

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 1) {
      return Z.ONE;
    }
    if (m == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long j = 1; j < n; ++j) {
      Z s = Z.ZERO;
      for (final Z dd : Jaguar.factor(j).divisors()) {
        final long d = dd.longValue();
        if (d >= m) {
          s = s.add(get(d, m - 1).multiply(d));
        }
      }
      sum = sum.add(s.multiply(get(n - j, m)));
    }
    return sum.divide(n - 1);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
