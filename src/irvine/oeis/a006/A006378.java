package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003052;

/**
 * A006378 Prime self <code>(or Colombian)</code> numbers: primes not expressible as the sum of an integer and its digit sum.
 * @author Sean A. Irvine
 */
public class A006378 implements Sequence {

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
