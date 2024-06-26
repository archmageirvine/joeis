package irvine.oeis.a018;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018800 Smallest prime that begins with n.
 * @author Sean A. Irvine
 */
public class A018800 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(mN);
    }
    long y = 1;
    while (true) {
      y *= 10;
      final Z x = Z.valueOf(mN).multiply(y);
      for (long r = 1; r < y; r += 2) {
        final Z t = x.add(r);
        if (mPrime.isPrime(t)) {
          return t;
        }
      }
    }
  }
}
