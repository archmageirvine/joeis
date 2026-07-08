package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A085756 Number of partitions into a prime number of distinct parts.
 * @author Sean A. Irvine
 */
public class A085756 extends MemoryFunction2Sequence<Long, Z> {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  /** Construct the sequence. */
  public A085756() {
    super(3);
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 0 || m < 1) {
      return Z.ZERO;
    }
    if (n == 0 || m == 1) {
      return Z.ONE;
    }
    final Z t = get(n, m - 1);
    return m > n ? t : t.add(get(n - m, m));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long p = 2; p * (p + 1) / 2 <= mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(get(mN - p * (p + 1) / 2, p));
    }
    return sum;
  }
}
