package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050434 Primes whose next higher prime is 100 greater.
 * @author Sean A. Irvine
 */
public class A050434 implements Sequence {

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
