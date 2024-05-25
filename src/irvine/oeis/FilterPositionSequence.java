package irvine.oeis;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A sequence consisting of the positions of consecutive records in another sequence.
 * Derived from <code>RecordPositionSequence</code>.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class FilterPositionSequence extends FilterSequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Integer mN; // current index

  /**
   * Creates a sequence of the positions where a condition is met.
   * @param offset first index
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param predicate condition for accepting terms
   */
  public FilterPositionSequence(final int offset, final int start, final Sequence seq, final Predicate<Z> predicate) {
    super(offset, seq, predicate);
    mN = start - 1;
  }

  /**
   * Filter with both the index and sequence value.
   * @param offset offset of filtered sequence
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   */
  public FilterPositionSequence(final int offset, final int start, final Sequence seq, final BiPredicate<Integer, Z> predicate) {
    super(offset, seq, predicate);
    mN = start - 1;
  }

  /**
   * Creates a sequence of the positions where a condition is met.
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param predicate condition for accepting terms
   */
  public FilterPositionSequence(final int start, final Sequence seq, final Predicate<Z> predicate) {
    this(1, start, seq, predicate);
  }

  /**
   * Creates a sequence of the positions where a condition is met.
   * @param offset first index
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param value the positions of this number are returned
   */
  public FilterPositionSequence(final int offset, final int start, final Sequence seq, final Z value) {
    this(offset, start, seq, value::equals);
  }

  /**
   * Creates a sequence of the positions where a condition is met.
   * @param offset first index
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param value the positions of this number are returned
   */
  public FilterPositionSequence(final int offset, final int start, final Sequence seq, final long value) {
    this(offset, start, seq, Z.valueOf(value));
  }

  /**
   * Creates a sequence of the positions where a condition is met.
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param value the positions of this number are returned
   */
  public FilterPositionSequence(final int start, final Sequence seq, final long value) {
    this(1, start, seq, value);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mSeq.next();
      if (t == null) {
        return null; // There can be no further terms
      }
      if (mPredicate != null) {
        if (mPredicate.test(t)) {
          return Z.valueOf(mN);
        }
      } else {
        assert mBiPredicate != null;
        if (mBiPredicate.test(mN, t)) {
          return Z.valueOf(mN);
        }
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
