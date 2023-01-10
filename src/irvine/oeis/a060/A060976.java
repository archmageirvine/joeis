package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000367;

/**
 * A060976 Odd nonprimes c which divide Bernoulli(2*c).
 * @author Sean A. Irvine
 */
public class A060976 extends A000367 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      super.next();
      if (super.next().mod(mN) == 0 && !mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
