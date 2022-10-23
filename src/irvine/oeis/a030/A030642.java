package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030642 Product of next 2 primes.
 * @author Sean A. Irvine
 */
public class A030642 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      final Z t = mPrime.nextPrime(mA);
      mA = t.multiply(mPrime.nextPrime(t));
    }
    return mA;
  }
}
