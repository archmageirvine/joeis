package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067933 Primes p such that p == -1 (mod phi(p-1)).
 * @author Sean A. Irvine
 */
public class A067933 extends Sequence1 {

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z euler = Functions.PHI.z(mP.subtract(Z.ONE));
      if (mP.add(1).mod(euler).isZero()) {
        return mP;
      }
    }
  }
}

