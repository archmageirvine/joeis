package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006489 <code>n-6, n, n+6</code> are primes.
 * @author Sean A. Irvine
 */
public class A006489 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z n = mP.add(6);
      if (n.isProbablePrime() && mP.add(12).isProbablePrime()) {
        return n;
      }
    }
  }
}

