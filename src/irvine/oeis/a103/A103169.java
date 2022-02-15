package irvine.oeis.a103;

import irvine.math.z.ZUtils;
import irvine.oeis.prime.ConsecutiveSequence;

/**
 * A103169 Start of seven consecutive primes whose digit reversals are also prime.
 * @author Georg Fischer
 */
public class A103169 extends ConsecutiveSequence {

  protected int mTuple; // length of the tuple

  /** Construct the sequence. */
  public A103169() {
    this(1, 7);
  }

  /**
   * Generic constructor with parameters
   * @param termNo which term is selected: 1st, 2nd ...
   * @param tuple length of the tuple
   */
  public A103169(final int termNo, final int tuple) {
    super(termNo);
    mTuple = tuple;
  }

  @Override
  protected boolean condition() {
    boolean result = true; // assume success
    int m = 0;
    while (result && m < mTuple) {
      if (!ZUtils.reverse(mTerms[(mCix + m) & mMask]).isPrime()) {
        result = false;
      }
      ++m;
    }
    return result;
  }
}
