package irvine.oeis;

import java.util.function.Predicate;

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A sequence generated by conditionally selecting particular terms depending on the current index.
 * @author Georg Fischer
 */
public class FilterLambdaSequence extends FilterSequence {

  private final Predicate<Z> mPredicate;
  private Z mN; // current index to be tested

  /**
   * Filter with just the sequence value.
   * @param offset offset of filtered sequence
   * @param predicate predicate used for filtering
   */
  public FilterLambdaSequence(final int offset, final Predicate<Z> predicate) {
    this(offset, offset, predicate);
  }

  /**
   * Filter with just the sequence value.
   * @param offset offset of filtered sequence
   * @param start first index to be tested
   * @param predicate predicate used for filtering
   */
  public FilterLambdaSequence(final int offset, final int start, final Predicate<Z> predicate) {
    super(offset, new A001477(), predicate);
    mN = Z.valueOf(start - 1);
    mPredicate = predicate;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mPredicate.test(mN)) {
        return mN;
      }
    }
  }
}
