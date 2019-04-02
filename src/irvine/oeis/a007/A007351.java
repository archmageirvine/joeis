package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007351 Where prime race 4m-1 vs. 4m+1 is tied.
 * @author Sean A. Irvine
 */
public class A007351 implements Sequence {

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();
  private long mPlus = 0;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mPlus += 2 - mP.mod(4);
      if (mPlus == 0) {
        return mP;
      }
    }
  }
}
