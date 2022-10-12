package irvine.oeis.a059;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059846 Smallest p primes which give q=2p+2n-1 primes. Smallest Sophie Germain primes generalized in a possible way: 1 is replaced by 2n-1.
 * @author Sean A. Irvine
 */
public class A059846 implements Sequence {

  private long mN = -1;
  private final Fast mPrime = new Fast();
  private final HashSet<Long> mSeen = new HashSet<>();

  @Override
  public Z next() {
    mN += 2;
    if (mPrime.isPrime(mN)) {
      mSeen.add(mN);
    }
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final long q = 2 * p + mN;
      if (mPrime.isPrime(q) && !mSeen.contains(p) && mSeen.add(q)) {
        mSeen.add(p);
        return Z.valueOf(p);
      }
    }
  }
}
