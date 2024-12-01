package irvine.oeis.a073;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073454 Number of repeated remainders arising when n is divided by all primes up to n: a(n) = pi(n) - A073453(n).
 * @author Sean A. Irvine
 */
public class A073454 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> res = new HashSet<>();
    long cnt = 0;
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      final long t = mN % p;
      if (!res.add(t)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
