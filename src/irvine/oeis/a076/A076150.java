package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076150 Start of 10 consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A076150 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 113;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && mPrime.nextPrime(mN) - mN >= 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
