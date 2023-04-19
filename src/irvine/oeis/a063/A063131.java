package irvine.oeis.a063;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063131 Odd composite numbers which in base 2 contain their largest proper factor as a substring of digits.
 * @author Sean A. Irvine
 */
public class A063131 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final int mBase;
  private long mN = 3;

  protected A063131(final int base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A063131() {
    this(2);
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && Long.toString(mN, mBase).contains(Long.toString(mN / LeastPrimeFactorizer.lpf(Z.valueOf(mN)).longValue(), mBase))) {
        return Z.valueOf(mN);
      }
    }
  }
}
