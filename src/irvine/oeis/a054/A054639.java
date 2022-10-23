package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054639 Queneau numbers: numbers n such that the Queneau-Daniel permutation {1, 2, 3, ..., n} -&gt; {n, 1, n-1, 2, n-2, 3, ...} is of order n.
 * @author Sean A. Irvine
 */
public class A054639 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean isA054639(final long n) {
    if (n == 1) {
      return true;
    }
    final long m = n & 3;
    if (m == 0) {
      return false;
    }
    final long p = 2 * n + 1;
    if (!mPrime.isPrime(p)) {
      return false;
    }
    final long r = new IntegersModMul(p).order(Z.TWO).longValueExact();
    return m == 3 && r == n || r == 2 * n;
  }

  @Override
  public Z next() {
    while (true) {
      if (isA054639(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
