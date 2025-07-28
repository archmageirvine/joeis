package irvine.oeis.a079;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079024 Let p and q be two prime numbers, not necessarily consecutive, such that q - p = 2n; a(n) is the number of distinct partitions of 2n into even numbers so that each partition corresponds to a consecutive prime difference pattern (k-tuple) and p&lt;=A000230(n). Multiple occurrences of a partition are not counted.
 * @author Sean A. Irvine
 */
public class A079024 extends Sequence1 {

  private final Fast mFast = new Fast();
  private long mN = 0;

  private String pattern(final long p, final long q) {
    final StringBuilder sb = new StringBuilder();
    for (long r = mFast.nextPrime(p); r <= q; r = mFast.nextPrime(r)) {
      sb.append(r - p).append(','); // Note this pattern is wrt to p, rather than consecutive primes, but that's fine here
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    final Set<String> patterns = new HashSet<>();
    while (true) {
      p = mFast.nextPrime(p);
      if (mFast.isPrime(p + mN)) {
        patterns.add(pattern(p, p + mN));
        if (mFast.nextPrime(p) == p + mN) {
          return Z.valueOf(patterns.size());
        }
      }
    }
  }
}
