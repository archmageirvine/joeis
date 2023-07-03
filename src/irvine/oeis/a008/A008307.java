package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A008307 Table T(n,k) giving number of permutations of [1..n] with order dividing k, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A008307 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n <= 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(k).divisors()) {
      final long d = dd.longValue();
      Z t = get(n - d, k);
      for (int i = 1; i < d; ++i) {
        t = t.multiply(n - i);
      }
      sum = sum.add(t);
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN + 1 - mM, mM);
  }
}
