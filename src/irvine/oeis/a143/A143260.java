package irvine.oeis.a143;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A143260 Primes that are not emirps.
 * @author Sean A. Irvine
 */
public class A143260 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z reverse = ZUtils.reverse(mP);
      if (reverse.equals(mP) || !mPrime.isPrime(reverse)) {
        return mP;
      }
    }
  }
}
