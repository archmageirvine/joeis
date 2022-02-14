package irvine.oeis.a106;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.prime.ConsecutiveSequence;

/**
 * A106809 Smallest prime of the set of eight consecutive primes whose sum of digits is a set of eight distinct primes.
 */
public class A106809 extends ConsecutiveSequence {

  protected int mTuple; // length of the tuple
  protected TreeSet<Long> mSet;

  /** Construct the sequence. */
  public A106809() {
    this(1, 8);
  }

  /**
   * Generic constructor with parameters
   * @param termNo which term is selected: 1st, 2nd ...
   * @param tuple length of the tuple
   */
  public A106809(final int termNo, final int tuple) {
    super(termNo);
    mTuple = tuple;
    mSet = new TreeSet<>();
  }

  /**
   * Fill the next prime into the ring buffers and increment the indexes.
   */
  protected void advance() {
    mCix = ++mCix & mMask;
    mP1 = mFastPrime.nextPrime(mP);
    ++mPrimeNo;
    mTerms[mPix] = mP1;
    mDiffs[mPix] = ZUtils.digitSum(mP1);
    mPix = ++mPix & mMask;
    mP = mP1;
  }

  @Override
  protected boolean condition() {
    boolean result = true; // assume success
    mSet.clear();
    int m = 0;
    while (result && m < mTuple) {
      long digSum = mDiffs[(mCix + m) & mMask];
      if (mSet.contains(digSum)) {
        result = false;
      } else if (Z.valueOf(digSum).isPrime()) {
        mSet.add(digSum);
      } else {
        result = false;
      }
      ++m;
    }
    return result && mSet.size() == mTuple;
  }
}
