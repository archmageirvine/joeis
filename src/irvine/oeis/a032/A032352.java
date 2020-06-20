package irvine.oeis.a032;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032352.
 * @author Sean A. Irvine
 */
public class A032352 implements Sequence {

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
