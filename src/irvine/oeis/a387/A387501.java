package irvine.oeis.a387;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387501 allocated for Chris R. Rehmann.
 * @author Sean A. Irvine
 */
public class A387501 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN - mPrime.prevPrime(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

