package irvine.oeis.a074;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074588 Rearrangement of odd primes such that a(k) + a(k+1) + 1 is a prime for all k.
 * @author Sean A. Irvine
 */
public class A074588 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mA = 3;

  @Override
  public Z next() {
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p) && mPrime.isPrime(mA + p + 1)) {
        mUsed.add(p);
        mA = p;
        return Z.valueOf(mA);
      }
    }
  }
}
