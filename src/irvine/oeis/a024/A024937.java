package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

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

  protected int target() {
    return 1;
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
    if (Functions.PRIME.i(m) > n) {
      return b;
    }
    final Z[] g = get(n - Functions.PRIME.i(m), m - 1);
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
