package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003629 Primes p <code>== +- 3 (mod 8),</code> or, primes p such that 2 is not a square mod p.
 * @author Sean A. Irvine
 */
public class A003629 implements Sequence {

  private Z mP = Z.TWO;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(8);
      if (r == 3 || r == 5) {
        return mP;
      }
    }
  }
}
