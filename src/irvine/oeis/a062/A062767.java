package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062767 Numbers k such that 3k+1, 3k+5 and 3k+7 are all prime.
 * @author Sean A. Irvine
 */
public class A062767 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long t = 3 * mN;
      if (mPrime.isPrime(t + 1) && mPrime.isPrime(t + 5) && mPrime.isPrime(t + 7)) {
        return Z.valueOf(mN);
      }
    }
  }
}

