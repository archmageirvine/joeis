package irvine.oeis.a008;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008470.
 * @author Sean A. Irvine
 */
public class A008470 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  protected boolean accept(final int c) {
    return c >= 3;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int c = 0;
      final long m = 10 * mN;
      if (mPrime.isPrime(m + 1)) {
        ++c;
      }
      if (mPrime.isPrime(m + 3)) {
        ++c;
      }
      if (mPrime.isPrime(m + 7)) {
        ++c;
      }
      if (mPrime.isPrime(m + 9)) {
        ++c;
      }
      if (accept(c)) {
        return Z.valueOf(mN);
      }
    }
  }
}
