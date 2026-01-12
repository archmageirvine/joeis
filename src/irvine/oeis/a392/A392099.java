package irvine.oeis.a392;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392099 Smallest prime p such that p + 3^n - 1 is also a prime.
 * @author Sean A. Irvine
 */
public class A392099 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    final Z t = mA.subtract(1);
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (t.add(p).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}

