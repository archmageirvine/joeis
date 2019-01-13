package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002515.
 * @author Sean A. Irvine
 */
public class A002515 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.mod(4) == 3 && mPrime.isPrime(mP.multiply2().add(1))) {
        return mP;
      }
    }
  }
}
