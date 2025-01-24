package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074671 Five-digit distinct-digit primes.
 * @author Sean A. Irvine
 */
public class A074671 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 10242;

  @Override
  public Z next() {
    while (mN < 100000) {
      mN = mPrime.nextPrime(mN);
      if (mN < 100000 && Integer.bitCount(Functions.SYNDROME.i(mN)) == 5) {
        return Z.valueOf(mN);
      }
    }
    return null;
  }
}
