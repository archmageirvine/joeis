package irvine.oeis.a032;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032352 Numbers k such that there is no prime between 10*k and 10*k+9.
 * @author Sean A. Irvine
 */
public class A032352 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 190;

  @Override
  public Z next() {
    while (true) {
      mN += 10;
      if (mPrime.nextPrime(mN) > mN + 10) {
        return Z.valueOf(mN / 10);
      }
    }
  }
}
