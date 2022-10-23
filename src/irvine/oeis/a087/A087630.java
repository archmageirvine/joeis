package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087630 Number of n-digit primes ending in 1 in base 10.
 * extended from A006880
 * @author Georg Fischer
 */
public class A087630 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mLimit;
  private long mP;
  private long mCount;
  protected long mEndDigit;

  /** Construct the sequence. */
  public A087630() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param endDigit last digit
   */
  public A087630(final long endDigit) {
    mEndDigit = endDigit;
    mLimit = 10L;
    mCount = 0L;
    mP = 2L;
  }

  @Override
  public Z next() {
    while (mP < mLimit) {
      if (mP % 10L == mEndDigit) {
        ++mCount;
      }
      mP = mPrime.nextPrime(mP);
    }
    final Z result = Z.valueOf(mCount);
    mLimit *= 10L;
    mCount = 0L;
    return result;
  }
}
