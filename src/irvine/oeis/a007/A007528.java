package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007528 Primes of the form 6k-1.
 * @author Sean A. Irvine
 */
public class A007528 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 4;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP % 6) == 5) {
        return Z.valueOf(mP);
      }
    }
  }
}
