package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;

/**
 * A024937 a(n) = number of 2's in all partitions of n into distinct primes.
 * @author Sean A. Irvine
 */
public class A024937 extends MemoryFunction2Sequence<Integer, Z[]> {

  // After Alois P. Heinz

  private static final Z[] C1 = {Z.ONE, Z.ZERO};
  private static final Z[] C2 = {Z.ZERO, Z.ZERO};
  private int mN = -1;
  private int mPi = 0;
  private final Fast mFast = new Fast();
  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A000040());

  protected int target() {
    return 1;
  }

  private int p(final int n) {
    return mPrimes.a(n - 1).intValueExact();
  }

  @Override
  protected Z[] compute(final Integer n, final Integer m) {
    if (n == 0) {
      return C1;
    }
    if (m < 1) {
      return C2;
    }
    final Z[] b = get(n, m - 1);
    if (p(m) > n) {
      return b;
    }
    final Z[] g = get(n - p(m), m - 1);
    return new Z[] {
      b[0].add(g[0]),
      b[1].add(g[1]).add(m == target() ? g[0] : Z.ZERO)
    };
  }

  @Override
  public Z next() {
    if (mFast.isPrime(++mN)) {
      ++mPi;
    }
    return get(mN, mPi)[1];
  }
}
