package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058654 The sum of a prime and a nonzero square.
 * @author Sean A. Irvine
 */
public class A058654 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long t = 1, s; (s = mN - t * t) > 0; ++t) {
        if (mPrime.isPrime(s)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
