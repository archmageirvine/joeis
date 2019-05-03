package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007659 Primes p such that Ramanujan number <code>tau(p)</code> is divisible by p.
 * @author Sean A. Irvine
 */
public class A007659 implements Sequence {

  // Too slow to be useful ...

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP > Integer.MAX_VALUE) {
        throw new UnsupportedOperationException();
      }
      final int p = (int) mP + 1;
      if (ThetaFunctions.delta24z(p).coeff(p).mod(mP) == 0) {
        return Z.valueOf(mP);
      }
    }
  }
}
