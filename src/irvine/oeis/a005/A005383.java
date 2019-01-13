package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005383.
 * @author Sean A. Irvine
 */
public class A005383 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.add(1).divide2())) {
        return mP;
      }
    }
  }
}
