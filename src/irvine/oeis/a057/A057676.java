package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A057676 Smallest prime q such that 2^prime(n) - q is prime.
 * @author Sean A. Irvine
 */
public class A057676 extends Sequence1 {

  private final A000040 mPrimes = new A000040();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z q = Z.ONE.shiftLeft(mPrimes.next().longValueExact());
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (q.subtract(p).abs().isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
