package irvine.oeis.a018;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018800.
 * @author Sean A. Irvine
 */
public class A018800 implements Sequence {

  private Fast mPrime = new Fast();
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
