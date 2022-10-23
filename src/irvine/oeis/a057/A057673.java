package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057673 Smallest prime p such that |2^n - p| is a prime.
 * @author Sean A. Irvine
 */
public class A057673 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mN.subtract(p).abs().isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
