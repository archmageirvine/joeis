package irvine.oeis.a160;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A160792 Vertex number of a rectangular spiral related to prime numbers. The distances between nearest edges of the spiral that are parallel to the initial edge are the prime numbers, while the distances between nearest edges perpendicular to the initial edge are all one.
 * @author Sean A. Irvine
 */
public class A160792 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A160792(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A160792() {
    super(0);
  }

  private final Fast mPrime = new Fast();
  private Z mPrimeSum = Z.ZERO;
  private Z mPrimeValue = Z.ONE;
  private Z mPrev = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    final Z s;
    if ((++mN & 1) == 0) {
      if (mN > 0) {
        mPrimeValue = mPrime.nextPrime(mPrimeValue);
        mPrimeSum = mPrimeSum.add(mPrimeValue);
      }
      s = mPrev.add(mPrimeSum);
    } else {
      s = mPrev.add(mN / 2 + 1);
    }
    mPrev = s;
    return s;
  }
}

