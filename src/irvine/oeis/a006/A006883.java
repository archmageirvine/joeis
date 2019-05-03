package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006883 Long period primes: the decimal expansion of <code>1/p</code> has period <code>p-1</code>.
 * @author Sean A. Irvine
 */
public class A006883 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP == 2) {
        return Z.TWO;
      }
      // There are probably much faster ways of doing this order calculation
      // find min k, such that n^k==1(mod mP). If k == mP-1 have what we want.
      for (long k = 1, n = 1; k < mP; ++k) {
        n *= 10;
        n %= mP;
        if (n == 1) {
          if (k == mP - 1) {
            return Z.valueOf(mP);
          } else {
            break;
          }
        }
      }
    }
  }
}
