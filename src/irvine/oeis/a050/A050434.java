package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050434 Primes whose next higher prime is 100 greater.
 * @author Sean A. Irvine
 */
public class A050434 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.valueOf(396727);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(6);
      if (mN.isProbablePrime()) {
        final Z t = mN.add(100);
        if (t.isProbablePrime() && t.equals(mPrime.nextPrime(mN))) {
          return mN;
        }
      }
    }
  }
}
