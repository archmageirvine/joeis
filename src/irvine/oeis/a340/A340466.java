package irvine.oeis.a340;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A340466 Primes whose binary expansion contains more 1&apos;s than 0&apos;s but at least one 0.
 * @author Georg Fischer
 */
public class A340466 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final int n1 = mP.bitCount();
      final int len = mP.bitLength();
      if (n1 > (len - n1) && (len - n1) > 0) {
        return mP;
      }
    }
  }
}
