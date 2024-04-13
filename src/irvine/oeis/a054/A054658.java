package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A054658 Primes beginning 1, 3, 7, 9 whose reversals are nonprimes.
 * @author Sean A. Irvine
 */
public class A054658 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(17);

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z reverse = Functions.REVERSE.z(mP);
      if (!reverse.equals(mP) && !mPrime.isPrime(reverse)) {
        final char s = mP.toString().charAt(0);
        if (s == '1' || s == '3' || s == '7' || s == '9') {
          return mP;
        }
      }
    }
  }
}

