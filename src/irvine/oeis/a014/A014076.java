package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014076 Odd nonprimes.
 * @author Sean A. Irvine
 */
public class A014076 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
