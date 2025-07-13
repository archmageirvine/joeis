package irvine.oeis.a385;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385323 a(n) is the smallest prime p for which the Diophantine equation Sum_{i=1..n} (x_i)^3 = p^3 has a solution, where (x_i), i=1..n, is a strictly increasing sequence of positive integers, or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A385323 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private boolean is(final long n, final long remaining, final long x) {
    if (remaining == 0) {
      return n == 0;
    }
    for (long k = x; k > 0; --k) {
      final long k3 = k * k * k;
      final long nsk3 = n - k3;
      if (nsk3 >= 0) {
        if (is(nsk3, remaining - 1, k - 1)) {
          return true;
        }
        if (k3 * remaining <= n) {
          return false;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.NEG_ONE;
    }
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (is(p * p * p, mN, p)) {
        return Z.valueOf(p);
      }
    }
  }
}

