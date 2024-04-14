package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001124 Primes with 5 as smallest primitive root.
 * @author Sean A. Irvine
 */
public class A001124 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.FIVE.equals(Functions.LEAST_PRIMITIVE_ROOT.z(mP))) {
        return mP;
      }
    }
  }
}

