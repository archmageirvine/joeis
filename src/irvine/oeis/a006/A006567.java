package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A006567 Emirps (primes whose reversal is a different <code>prime)</code>.
 * @author Sean A. Irvine
 */
public class A006567 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(11);

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z reverse = ZUtils.reverse(mP);
      if (!reverse.equals(mP) && mPrime.isPrime(reverse)) {
        return mP;
      }
    }
  }
}
