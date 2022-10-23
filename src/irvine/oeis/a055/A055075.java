package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055075 Numbers expressible as the sum of no more than 5 squares of composite numbers, allowing repetitions.
 * @author Sean A. Irvine
 */
public class A055075 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 15;

  private boolean is(final long n, final int terms, final long sum, final long v) {
    if (n == sum) {
      return true;
    }
    if (terms == 5) {
      return false;
    }
    long u = v;
    while (sum + u * u <= n) {
      if (!mPrime.isPrime(u) && is(n, terms + 1, sum + u * u, u)) {
        return true;
      }
      ++u;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1167 || is(mN, 0, 0, 4)) {
        return Z.valueOf(mN);
      }
    }
  }
}

