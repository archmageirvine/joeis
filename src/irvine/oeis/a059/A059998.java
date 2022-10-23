package irvine.oeis.a059;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059998 Number of different primes occurring when n is expressed as p1+q1+r1 = ... = pk+qk+rk where pk,qk,rk are primes with pk &lt;= qk &lt;= rk.
 * @author Sean A. Irvine
 */
public class A059998 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private void representations(final Set<Long> seen, final long n) {
    for (long p = 2; p <= n / 3; p = mPrime.nextPrime(p)) {
      for (long q = p; q <= (n - p) / 2; q = mPrime.nextPrime(q)) {
        final long r = n - p - q;
        if (mPrime.isPrime(r)) {
          seen.add(p);
          seen.add(q);
          seen.add(r);
        }
      }
    }
  }

  @Override
  public Z next() {
    final HashSet<Long> seen = new HashSet<>();
    representations(seen, ++mN);
    return Z.valueOf(seen.size());
  }
}
