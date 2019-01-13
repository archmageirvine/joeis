package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000355.
 * @author Sean A. Irvine
 */
public class A000355 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(20);
      if ((r == 3 || r == 9 || r == 11) && mPrime.isPrime(mP.multiply2().add(1))) {
        return mP;
      }
    }
  }
}
