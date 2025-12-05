package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A390983 The smallest prime whose representation in base n contains the digit 0.
 * @author Sean A. Irvine
 */
public class A390983 extends Sequence2 {

  private long mN = 1;
  private final Fast mPrime = new Fast();

  private boolean is(long p, final long base) {
    while (p != 0) {
      if (p % base == 0) {
        return true;
      }
      p /= base;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long p = mN - 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (is(p, mN)) {
        return Z.valueOf(p);
      }
    }
  }
}
