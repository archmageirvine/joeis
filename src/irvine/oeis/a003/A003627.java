package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003627 Primes of the form 3n-1.
 * @author Sean A. Irvine
 */
public class A003627 implements Sequence {

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.mod(3) == 2) {
        return mP;
      }
    }
  }
}
