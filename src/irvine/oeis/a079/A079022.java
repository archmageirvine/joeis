package irvine.oeis.a079;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A079022 Suppose p and q = p + 2*n are primes. Define the difference pattern of (p, q) to be the successive differences of the primes in the range p to q. There are a(n) possible difference patterns.
 * @author Sean A. Irvine
 */
public class A079022 extends Sequence1 implements Conjectural {

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
    final Set<String> patterns = new HashSet<>();
    long p = 1;
    long k = 0;
    final long lim = 2L << (4 * mN / 5); // Heuristic
    while (++k < lim) {
      p = mFast.nextPrime(p);
      if (mFast.isPrime(p + mN)) {
        patterns.add(pattern(p, p + mN));
      }
    }
    return Z.valueOf(patterns.size());
  }
}
