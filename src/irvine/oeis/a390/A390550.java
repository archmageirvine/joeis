package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390550 allocated for Davide Oliveri.
 * @author Sean A. Irvine
 */
public class A390550 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || mN == 5) {
      return Z.ZERO;
    }
    Z b = Z.ONE;
    while (true) {
      b = b.add(1);
      Z sum = Z.ZERO;
      for (long k = 1, p = 2; k <= mN; ++k, p = mPrime.nextPrime(p)) {
        sum = sum.add(b.pow(p - 2));
      }
      if (sum.isProbablePrime()) {
        return b;
      }
    }
  }
}
