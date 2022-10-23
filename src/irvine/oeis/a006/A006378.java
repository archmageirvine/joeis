package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003052;

/**
 * A006378 Prime self (or Colombian) numbers: primes not expressible as the sum of an integer and its digit sum.
 * @author Sean A. Irvine
 */
public class A006378 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (A003052.isColumbian(mP)) {
        return Z.valueOf(mP);
      }
    }
  }

}
