package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A038499 Number of partitions of n into a prime number of parts.
 * @author Sean A. Irvine
 */
public class A038499 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 0) {
      return Z.ZERO;
    }
    if (n == 0 || m == 1) {
      return Z.ONE;
    }
    if (m < 1) {
      return Z.ZERO;
    }
    final Z t = get(n, m - 1);
    return m > n ? t : t.add(get(n - m, m));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(get(mN - p, p));
    }
    return sum;
  }
}
