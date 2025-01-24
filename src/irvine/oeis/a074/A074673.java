package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074673 Four-digit distinct-digit primes.
 * @author Sean A. Irvine
 */
public class A074673 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1038;

  @Override
  public Z next() {
    while (mN < 10000) {
      mN = mPrime.nextPrime(mN);
      if (mN < 10000 && Integer.bitCount(Functions.SYNDROME.i(mN)) == 4) {
        return Z.valueOf(mN);
      }
    }
    return null;
  }
}
