package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001125 Primes with 6 as smallest primitive root.
 * @author Sean A. Irvine
 */
public class A001125 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.SIX.equals(Functions.LEAST_PRIMITIVE_ROOT.z(mP))) {
        return mP;
      }
    }
  }
}

