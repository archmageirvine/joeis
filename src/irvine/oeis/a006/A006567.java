package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006567 Emirps (primes whose reversal is a different prime).
 * @author Sean A. Irvine
 */
public class A006567 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(11);

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Predicates.EMIRP.is(mP)) {
        return mP;
      }
    }
  }
}
