package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002124 Number of compositions of n into a sum of odd primes.
 * @author Sean A. Irvine
 */
public class A002124 extends MemorySequence {

  private final Fast mPrime = new Fast();

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
    case 0:
      return Z.ONE;
    case 1:
    case 2:
      return Z.ZERO;
    default:
      Z s = Z.ZERO;
      long p = 2;
      while ((p = mPrime.nextPrime(p)) <= n) {
        final int pp = (int) p;
        s = s.add(get(n - pp));
      }
      return s;
    }
  }
}
