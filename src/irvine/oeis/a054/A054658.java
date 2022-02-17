package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054658 Primes beginning 1, 3, 7, 9 whose reversals are nonprimes.
 * @author Sean A. Irvine
 */
public class A054658 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(17);

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z reverse = ZUtils.reverse(mP);
      if (!reverse.equals(mP) && !mPrime.isPrime(reverse)) {
        final char s = mP.toString().charAt(0);
        if (s == '1' || s == '3' || s == '7' || s == '9') {
          return mP;
        }
      }
    }
  }
}

