package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.prime.ConsecutiveSequence;

/**
 * A106711 Smaller prime of the set of two consecutive primes each of whose sum of digits is prime.
 * @author Georg Fischer
 */
public class A106711 extends ConsecutiveSequence {

  protected int mTuple; // length of the tuple

  /** Construct the sequence. */
  public A106711() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param termNo which term is selected: 1st, 2nd ...
   * @param tuple length of the tuple
   */
  public A106711(final int termNo, final int tuple) {
    super(termNo);
    mTuple = tuple;
  }

  @Override
  protected boolean condition() {
    boolean result = true; // assume success
    int m = 0;
    while (result && m < mTuple) {
      if (!Z.valueOf(ZUtils.digitSum(mTerms[(mCix + m) & mMask])).isPrime()) {
        result = false;
      }
      ++m;
    }
    return result;
  }
}
