package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057674 Primes -p+2^n with smallest p prime, arising in A057674.
 * @author Sean A. Irvine
 */
public class A057674 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply2();
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z t = mN.subtract(p);
      if (t.abs().isProbablePrime()) {
        return t;
      }
    }
  }
}
