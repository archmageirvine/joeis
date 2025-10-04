package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080906 Primes with an even number of digits such that the first half of the digits and the second half of the digits are both primes.
 * @author Sean A. Irvine
 */
public class A080906 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 10;
  private long mL = 100;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP > mL) {
        mP = mL * 10;
        mL *= 100;
      } else {
        final String s = Long.toString(mP);
        final int h = s.length() / 2;
        if (mPrime.isPrime(Long.parseLong(s.substring(0, h))) && mPrime.isPrime(Long.parseLong(s.substring(h)))) {
          return Z.valueOf(mP);
        }
      }
    }
  }
}

