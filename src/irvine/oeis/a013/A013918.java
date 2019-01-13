package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013918.
 * @author Sean A. Irvine
 */
public class A013918 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mSum = mSum.add(mP);
      if (mPrime.isPrime(mSum)) {
        return mSum;
      }
    }
  }
}
