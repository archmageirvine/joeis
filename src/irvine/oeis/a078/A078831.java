package irvine.oeis.a078;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078831 Numbers n with unique occurrence of all binary substrings representing primes in binary representation of n.
 * @author Sean A. Irvine
 */
public class A078831 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private boolean is(final long n) {
    long m = n;
    final HashSet<Long> seen = new HashSet<>();
    do {
      long k = 1;
      long j = 1;
      while (k <= m) {
        k <<= 1;
        k += 1;
        j <<= 1;
        if ((m & j) != 0) {
          final long r = m & k;
          if (mPrime.isPrime(r)) {
            if (!seen.add(r)) {
              return false;
            }
          }
        }
      }
      m >>>= 1;
    } while (m > 1);
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
