package irvine.oeis.a019;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019334 Primes with primitive root 3.
 * @author Sean A. Irvine
 */
public class A019334 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  protected Z root() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z q = root().mod(mP);
      if (!Z.ZERO.equals(q) && new IntegersModMul(mP).order(q).equals(mP.subtract(1))) {
        return mP;
      }
    }
  }
}

