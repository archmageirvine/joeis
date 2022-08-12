package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035232 Number of substrings of n which are primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A035232 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long c = 0;
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      final String ps = String.valueOf(p);
      for (int t = s.indexOf(ps); t >= 0; t = s.indexOf(ps, t + 1)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

