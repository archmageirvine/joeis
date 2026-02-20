package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078492 No-prime decades.
 * @author Sean A. Irvine
 */
public class A078492 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 190;

  @Override
  public Z next() {
    while (true) {
      mN += 10;
      if (mPrime.nextPrime(mN) - mN > 10) {
        return Z.valueOf(mN);
      }
    }
  }
}

