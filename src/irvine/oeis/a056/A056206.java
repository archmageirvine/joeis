package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056206 Smallest prime p such that p + 2^n is also a prime.
 * @author Sean A. Irvine
 */
public class A056206 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mA.add(p).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
