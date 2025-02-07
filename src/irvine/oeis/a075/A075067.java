package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075067 Start of the first run of exactly n consecutive odd composite numbers.
 * @author Sean A. Irvine
 */
public class A075067 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long c = 9;
    while (true) {
      final long p = mPrime.nextPrime(c);
      if (p - c == 2 * mN) {
        return Z.valueOf(c);
      }
      c = p + 2;
      while (mPrime.isPrime(c)) {
        c += 2;
      }
    }
  }
}

