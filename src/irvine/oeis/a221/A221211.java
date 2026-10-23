package irvine.oeis.a221;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A221211 Numbers n such that n and n + 4 are prime and there is a power of two in the interval (n,n+4).
 * @author Georg Fischer
 */
public class A221211 extends AbstractSequence {

  private final long mGap;
  private Z mK;
  private Z mPow2; // current power of 2

  /** Construct the sequence. */
  public A221211() {
    this(1, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param gap gap between the two primes
   */
  public A221211(final int offset, final long gap) {
    super(offset);
    mGap = gap;
    mK = Z.ONE;
    mPow2 = Z.valueOf(32); // a lot greater than any gap
  }

  @Override
  public Z next() {
    // linear, direct inspection range
    while (mK.compareTo(mPow2) < 0) {
      mK = mK.add(2);
      final Z kGap = mK.add(mGap);
      if (mK.bitLength() != kGap.bitLength() && Predicates.PRIME.is(mK) && Predicates.PRIME.is(kGap)) {
        return mK;
      }
    }
    // now mK >= mPow2 + 1 - advance by powers of 2
    while (true) {
      mPow2 = mPow2.shiftLeft(1);
      mK = mPow2.subtract(mGap).add(1);
      while (mK.compareTo(mPow2) < 0) {
        final Z kGap = mK.add(mGap);
        if (Predicates.PRIME.is(mK) && Predicates.PRIME.is(kGap)) {
          return mK;
        }
        mK = mK.add(2);
      }
    }
  }
}
