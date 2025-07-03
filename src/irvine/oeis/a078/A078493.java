package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078493 One-prime decades.
 * @author Sean A. Irvine
 */
public class A078493 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 80;

  @Override
  public Z next() {
    while (true) {
      mN += 10;
      final long p = mPrime.nextPrime(mN);
      if (p - mN < 10 && mPrime.nextPrime(p) - mN > 10) {
        return Z.valueOf(mN);
      }
    }
  }
}

