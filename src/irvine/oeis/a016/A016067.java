package irvine.oeis.a016;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016067.
 * @author Sean A. Irvine
 */
public class A016067 implements Sequence {

  // Assumes terms are odd

  private final Fast mPrime = new Fast();
  private long mPrev = 0;
  private long mN = -1;

  private long countRepresentations(final long n) {
    long rep = 0;
    long t;
    for (long m = 0; (t = n - 2 * m * m) > 0; ++m) {
      if (t == 1 || mPrime.isPrime(t)) {
        ++rep;
      }
    }
    return rep;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long rep = countRepresentations(mN);
      if (rep > mPrev) {
        if (rep >= mPrev + 2) {
          mPrev = rep;
          return Z.valueOf(mN);
        }
        mPrev = rep;
      }
    }
  }
}
