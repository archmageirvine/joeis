package irvine.oeis.a078;

import irvine.oeis.prime.ConsecutiveSequence;

/**
 * A078847 Initial term in sequence of four consecutive primes separated by 3 consecutive differences each &lt;= 6 (i.e., when d = 2, 4 or 6) and forming pattern = [2, 4, 6]; short notation = [246] d-pattern.
 * @author Georg Fischer
 */
public class A078847 extends ConsecutiveSequence {

  protected int mTermIx; // 0 for first, 1 for second term in the set etc.
  protected int[] mGaps; // gaps between the consecutive primes

  /** Construct the sequence. */
  public A078847() {
    this(1, 2, 4, 6);
  }

  /**
   * Generic constructor with parameters
   * @param termNo which term is selected: 1st, 2nd ...
   * @param gaps list of differences between the consecutive primes
   */
  public A078847(final int termNo, final int... gaps) {
    super(termNo);
    mGaps = gaps;
  }

  @Override
  protected boolean condition() {
    boolean result = true; // assume success
    int m = 0;
    while (result && m < mGaps.length) {
      if (mDiffs[(mCix + m + 1) & mMask] != mGaps[m]) {
        result = false;
      }
      ++m;
    }
    return result;
  }
}
