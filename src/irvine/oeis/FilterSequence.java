package irvine.oeis;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A sequence generated by selecting particular terms from another sequence.
 * @author Sean A. Irvine
 */
public class FilterSequence extends AbstractSequence {

  /** Prime terms. */
  public static final Predicate<Z> PRIME = Z::isProbablePrime;
  /** Non-prime terms. */
  public static final Predicate<Z> NONPRIME = k -> !k.isProbablePrime();
  /** Zero terms. */
  public static final Predicate<Z> ZERO = Z::isZero;
  /** One terms. */
  public static final Predicate<Z> ONE = k -> k.equals(Z.ONE);
  /** Nonzero terms. */
  public static final Predicate<Z> NONZERO = k -> !k.isZero();
  /** Positive terms. */
  public static final Predicate<Z> POSITIVE = k -> k.compareTo(Z.ZERO) > 0;
  /** Negative terms. */
  public static final Predicate<Z> NEGATIVE = k -> k.compareTo(Z.ZERO) < 0;
  /** Palindromic terms. */
  public static final Predicate<Z> PALINDROME = k -> ZUtils.isPalindrome(k, 10);
  /** Odd terms. */
  public static final Predicate<Z> ODD = Z::isOdd;
  /** Even terms. */
  public static final Predicate<Z> EVEN = Z::isEven;
  /** Square terms. */
  public static final Predicate<Z> SQUARE = Z::isSquare;
  /** Cube terms. */
  public static final Predicate<Z> CUBE = ZUtils::isCube;
  /** Triangular terms. */
  public static final Predicate<Z> TRIANGULAR = ZUtils::isTriangular;
  /** Squarefree terms. */
  public static final Predicate<Z> SQUAREFREE = k -> Jaguar.factor(k).isSquareFree();
  /** Nonsquarefree terms. */
  public static final Predicate<Z> NONSQUAREFREE = k -> !Jaguar.factor(k).isSquareFree();
  /** Power of 2 terms. */
  public static final Predicate<Z> POWER2 = k -> k.bitCount() == 1;
  /** Semiprime terms. */
  public static final Predicate<Z> SEMIPRIME = k -> Jaguar.factor(k).isSemiprime();

  /** Divisible by index. */
  public static final BiPredicate<Long, Z> DIVISIBLE_BY_INDEX = (k, v) -> v.mod(k) == 0;

  protected final Sequence mSeq;
  protected final Predicate<Z> mPredicate;
  protected final BiPredicate<Long, Z> mBiPredicate;
  private long mN = 0;

  /**
   * Filter with both the index and sequence value.
   * @param offset offset of filtered sequence
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   */
  public FilterSequence(final int offset, final Sequence seq, final BiPredicate<Long, Z> predicate) {
    super(offset);
    mSeq = seq;
    mPredicate = null;
    mBiPredicate = predicate;
    mN = seq.getOffset() - 1;
  }

  /**
   * Filter with just the sequence value.
   * @param offset offset of filtered sequence
   * @param seq underlying sequence
   * @param predicate predicate used for filtering
   */
  public FilterSequence(final int offset, final Sequence seq, final Predicate<Z> predicate) {
    super(offset);
    mSeq = seq;
    mPredicate = predicate;
    mBiPredicate = null;
  }

  /**
   * Filter with inferred offset.  If <code>seq</code> has an offset, that will be used,
   * otherwise the offset will be 1.
   * @param seq first sequence
   * @param predicate combination operation
   */
  public FilterSequence(final Sequence seq, final Predicate<Z> predicate) {
    this(seq.getOffset(), seq, predicate);
  }

  @Override
  public Z next() {
    if (mPredicate != null) {
      while (true) {
        final Z t = mSeq.next();
        if (t == null || mPredicate.test(t)) {
          return t;
        }
      }
    } else {
      assert mBiPredicate != null;
      while (true) {
        ++mN;
        final Z t = mSeq.next();
        if (t == null || mBiPredicate.test(mN, t)) {
          return t;
        }
      }
    }
  }
}
