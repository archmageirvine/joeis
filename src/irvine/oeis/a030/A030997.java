package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030997 Smallest prime which is a concatenation of n consecutive primes.
 * @author Sean A. Irvine
 */
public class A030997 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long start = 1;
    while (true) {
      start = mPrime.nextPrime(start);
      final StringBuilder t = new StringBuilder();
      for (long k = 0, p = start; k < mN; ++k, p = mPrime.nextPrime(p)) {
        t.append(p);
      }
      final Z candidate = new Z(t);
      if (candidate.isProbablePrime()) {
        return candidate;
      }
    }
  }
}
