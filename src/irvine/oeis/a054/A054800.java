package irvine.oeis.a054;

import irvine.oeis.prime.ConsecutiveSequence;

/**
 * A054800 First term of balanced prime quartets: p(m+1)-p(m) = p(m+2)-p(m+1) = p(m+3)-p(m+2).
 * Partly copied form A002371
 * @author Georg Fischer
 */
public class A054800 extends ConsecutiveSequence {

  protected int mCompSig; // signature, comparison operator: -1 for weak, 0 for balanced, 1 for strong
  protected int mCompLen; // number of comparisons

  /** Construct the sequence. */
  public A054800() {
    this(1, 0, 4);
  }

  /**
   * Generic constructor with parameters
   * @param termNo which term is selected: 1st, 2nd ...
   * @param compSig 0 = balanced, 1 &gt; strong, -1 &lt; weak
   * @param tuple 4 quartet, 5 quintet, ...
   */
  public A054800(final int termNo, final int compSig, final int tuple) {
    super(termNo);
    mCompSig = compSig;
    mCompLen = tuple - 2;
  }

  @Override
  protected boolean condition() {
    boolean result = true; // assume success
    int m = 0;
    while (result && m < mCompLen) {
      if (Long.signum(mDiffs[(mCix + m + 1) & mMask] - mDiffs[(mCix + m + 2) & mMask]) != mCompSig) {
        result = false;
      }
      ++m;
    }
    return result;
  }
}
