package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001097.
 * @author Sean A. Irvine
 */
public class A001097 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      if (mPrime.isPrime(mN.add(2)) || mPrime.isPrime(mN.subtract(2))) {
        return mN;
      }
    }
  }
}

