package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007488 Primes whose reversal is a square.
 * @author Sean A. Irvine
 */
public class A007488 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(60);

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Functions.REVERSE.z(mP).isSquare()) {
        return mP;
      }
    }
  }
}
