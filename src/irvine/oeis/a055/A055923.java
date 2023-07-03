package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A055923 Number of partitions of n in which each part occurs a prime number (or 0) times.
 * @author Sean A. Irvine
 */
public class A055923 extends MemoryFunction2Sequence<Integer, Z> {

  // After Alois P. Heinz

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 2; k <= n / m; k = (int) mPrime.nextPrime(k)) {
      sum = sum.add(get(n - m * k, m - 1));
    }
    return sum.add(get(n, m - 1));
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
