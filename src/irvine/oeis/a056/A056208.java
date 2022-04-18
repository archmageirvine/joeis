package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056208 Primes p+2^n arising in A056206.
 * @author Sean A. Irvine
 */
public class A056208 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z t = mA.add(p);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
