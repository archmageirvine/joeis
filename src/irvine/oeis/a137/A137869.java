package irvine.oeis.a137;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A137869 Primes p with property that (p - previous prime) &gt;= 6 and (next prime - p) &gt;= 6.
 * @author Georg Fischer
 */
public class A137869 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mA;
  private long mB;
  private final long mDist; // minimum distance to previous and next prime

  /** Construct the sequence. */
  public A137869() {
    this(1, 4);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param dist (minimum distance to previous and next prime) - 2
   */
  public A137869(final int offset, final int dist) {
    super(offset);
    mDist = dist + 2;
    mA = mPrime.nextPrime(2);
    mB = mPrime.nextPrime(mA);
  }

  @Override
  public Z next() {
    while (true) {
      final long c = mPrime.nextPrime(mB);
      if (mB - mA >= mDist && c - mB >= mDist) {
        final Z result = Z.valueOf(mB);
        mA = mB;
        mB = c;
        return result;
      }
      mA = mB;
      mB = c;
    }
  }
}
