package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A001583 Artiads: the primes p <code>== 1 mod 5</code> for which Fibonacci((p-1)/5) is divisible by p.
 * @author Sean A. Irvine
 */
public class A001583 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 210;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP > Integer.MAX_VALUE) {
        throw new UnsupportedOperationException();
      }
      if (mP % 5 == 1 && Fibonacci.fibonacci((int) (mP / 5)).mod(mP) == 0) {
        return Z.valueOf(mP);
      }
    }
  }
}
