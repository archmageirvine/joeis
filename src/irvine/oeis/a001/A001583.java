package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001583 Artiads: the primes p == 1 (mod 5) for which Fibonacci((p-1)/5) is divisible by p.
 * @author Sean A. Irvine
 */
public class A001583 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 210;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP > Integer.MAX_VALUE) {
        throw new UnsupportedOperationException();
      }
      if (mP % 5 == 1 && Functions.FIBONACCI.z((long) (int) (mP / 5)).mod(mP) == 0) {
        return Z.valueOf(mP);
      }
    }
  }
}
