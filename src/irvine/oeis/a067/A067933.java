package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A067933 Primes p such that p <code>== -1 (mod</code> phi(p-1)).
 * @author Sean A. Irvine
 */
public class A067933 implements Sequence {

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z euler = Euler.phi(mP.subtract(Z.ONE));
      if (Z.ZERO.equals(mP.add(1).mod(euler))) {
        return mP;
      }
    }
  }
}

