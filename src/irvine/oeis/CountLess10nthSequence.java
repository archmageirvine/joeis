package irvine.oeis;

import java.util.function.Predicate;

import irvine.math.z.Z;

/**
 * Number of terms of some underlying sequence less than 10^n fulfilling some condition.
 * @author Georg Fischer
 */
public class CountLess10nthSequence extends AbstractSequence {


  private final Sequence mSeq;
  private final Predicate<Z> mPredicate;
  private Z mTerm; // the current term of mSeq
  private Z mLimit;
  private long mCount;
  private final int mEq;

  /**
   * Count the sequence terms below 10^n.
   * @param offset first index
   * @param seq underlying sequence
   */
  public CountLess10nthSequence(final int offset, final Sequence seq) {
    this(offset, seq, term -> true);
  }

  /**
   * Count the sequence terms below 10^n fulfilling the predicate.
   * @param offset first index
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   */
  public CountLess10nthSequence(final int offset, final Sequence seq, final Predicate<Z> predicate) {
    this(offset, seq, predicate, 0);
  }

  /**
   * Count the sequence terms below 10^n fulfilling the predicate.
   * @param offset first index
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   * @param eq 0 for &lt;10^n, 1 for &lt=10^n
   */
  public CountLess10nthSequence(final int offset, final Sequence seq, final Predicate<Z> predicate, final int eq) {
    super(offset);
    mSeq = seq;
    mPredicate = predicate;
    mLimit = Z.TEN.pow(offset);
    mEq = eq;
    mCount = 0;
    mTerm = seq.next();
  }

  @Override
  public Z next() {
    while (mTerm.compareTo(mLimit.add(mEq)) < 0) {
      if (mPredicate.test(mTerm)) {
        ++mCount;
      }
      mTerm = mSeq.next();
    }
    mLimit = mLimit.multiply(10);
    return Z.valueOf(mCount);
  }

}
