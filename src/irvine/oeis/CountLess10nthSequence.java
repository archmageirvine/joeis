package irvine.oeis;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import irvine.math.z.Z;

/**
 * Number of terms of some underlying sequence less than 10^n fulfilling some condition.
 * @author Georg Fischer
 */
public class CountLess10nthSequence extends AbstractSequence {

  private Sequence mSeq;
  private final Predicate<Z> mPredicate;
  private final BiPredicate<Integer, Z> mBiPredicate;
  private Z mTerm; // the current term of mSeq
  private Z mLimit;
  protected int mPow; // mLimit = mBase^mPow
  private long mCount;
  private int mEq;
  private int mBase; // base of limits: < 2^n, < 10^n etc.
  private Integer mN;

  /**
   * Initialize the parameters.
   * @param offset first index
   * @param seq underlying sequence
   * @param eq 0 for &lt; 10^n, 1 for &lt;= 10^n
   * @param base number base for the limits: 2, 3, 10
   */
  private void initialize(final int offset, final Sequence seq, final int eq, final int base) {
    mSeq = seq;
    mPow = offset;
    mLimit = Z.valueOf(base).pow(mPow);
    mEq = eq;
    mBase = base;
    mCount = 0;
    mTerm = seq.next();
    mN = seq.getOffset() - 1;
  }

  /**
   * Count the sequence terms below 10^n.
   * @param offset first index
   * @param seq underlying sequence
   */
  public CountLess10nthSequence(final int offset, final Sequence seq) {
    this(offset, seq, term -> true, 0, 10);
  }

  /**
   * Count the sequence terms below base^n.
   * @param offset first index
   * @param seq underlying sequence
   * @param base base of limits
   */
  public CountLess10nthSequence(final int offset, final Sequence seq, final int base) {
    this(offset, seq, term -> true, 0, base);
  }

  /**
   * Count the sequence terms below 10^n fulfilling the predicate.
   * @param offset first index
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   */
  public CountLess10nthSequence(final int offset, final Sequence seq, final Predicate<Z> predicate) {
    this(offset, seq, predicate, 0, 10);
  }

  /**
   * Count the sequence terms below 10^n fulfilling the predicate.
   * @param offset first index
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   */
  public CountLess10nthSequence(final int offset, final Sequence seq, final BiPredicate<Integer, Z> predicate) {
    this(offset, seq, predicate, 0, 10);
  }

  /**
   * Count the sequence terms below 10^n fulfilling the predicate.
   * @param offset first index
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   * @param eq 0 for &lt; 10^n, 1 for &lt;= 10^n
   */
  public CountLess10nthSequence(final int offset, final Sequence seq, final Predicate<Z> predicate, final int eq) {
    super(offset);
    mPredicate = predicate;
    mBiPredicate = null;
    initialize(offset, seq, eq, 10);
  }


  /**
   * Count the sequence terms below 10^n fulfilling the predicate.
   * @param offset first index
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   * @param eq 0 for &lt; 10^n, 1 for &lt;= 10^n
   */
  public CountLess10nthSequence(final int offset, final Sequence seq, final BiPredicate<Integer, Z> predicate, final int eq) {
    super(offset);
    mPredicate = null;
    mBiPredicate = predicate;
    initialize(offset, seq, eq, 10);
  }

  /**
   * Count the sequence terms below base^n fulfilling the predicate.
   * @param offset first index
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   * @param eq 0 for &lt; base^n, 1 for &lt;= base^n
   * @param base number base for the limits
   */
  public CountLess10nthSequence(final int offset, final Sequence seq, final Predicate<Z> predicate, final int eq, final int base) {
    super(offset);
    mPredicate = predicate;
    mBiPredicate = null;
    initialize(offset, seq, eq, base);
  }


  /**
   * Count the sequence terms below base^n fulfilling the predicate.
   * @param offset first index
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   * @param eq 0 for &lt; base^n, 1 for &lt;= base^n
   * @param base number base for the limits
   */
  public CountLess10nthSequence(final int offset, final Sequence seq, final BiPredicate<Integer, Z> predicate, final int eq, final int base) {
    super(offset);
    mPredicate = null;
    mBiPredicate = predicate;
    initialize(offset, seq, eq, base);
  }

  @Override
  public Z next() {
    if (mPredicate != null) {
      while (mTerm.compareTo(mLimit.add(mEq)) < 0) {
        // System.out.println("mTerm=" + mTerm + ", mLimit=" + mLimit + ", mCount=" + mCount);
        if (mPredicate.test(mTerm)) {
          ++mCount;
        }
        mTerm = mSeq.next();
      }
      ++mPow;
      mLimit = mLimit.multiply(mBase);
      return Z.valueOf(mCount);
    } else {
      assert mBiPredicate != null;
      while (Z.valueOf(mN).compareTo(mLimit.add(mEq)) < 0) {
        // System.out.println("mN=" + mN + ", mTerm=" + mTerm + ", mLimit=" + mLimit + ", mCount=" + mCount);
        if (mBiPredicate.test(mN, mTerm)) {
          ++mCount;
        }
        mTerm = mSeq.next();
        ++mN;
      }
      ++mPow;
      mLimit = mLimit.multiply(mBase);
      return Z.valueOf(mCount);
    }
  }

}
