package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001126 Primes with 7 as smallest primitive root.
 * @author Sean A. Irvine
 */
public class A001126 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.SEVEN.equals(Functions.LEAST_PRIMITIVE_ROOT.z(mP))) {
        return mP;
      }
    }
  }
}

