package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075321 Pair the odd primes so that the n-th pair is (p, p+2n) where p is the smallest prime not included earlier such that p and p+2n are primes and p+2n also does not occur earlier: (3, 5), (7, 11), (13, 19), (23, 31), (37, 47), (17, 29), (53, 67) ... This is the sequence of the first member of every pair.
 * @author Sean A. Irvine
 */
public class A075321 extends Sequence1 {

  private final Fast mPrimes = new Fast();
  private final Set<Z> mSeen = new HashSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    Z p = Z.TWO;
    while (true) {
      p = mPrimes.nextPrime(p);
      if (!mSeen.contains(p)) {
        final Z q = p.add(mN);
        if (q.isProbablePrime() && mSeen.add(q)) {
          mSeen.add(p);
          return p;
        }
      }
    }
  }
}
