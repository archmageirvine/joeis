package irvine.oeis;

import irvine.math.z.Z;

/**
 * Return the sequence <code>a(n)</code> of quotients of successive terms of the two underlying sequences.
 * @author Georg Fischer
 */
public class QuotientSequence extends AbstractSequence {

  private static final int DEFOFF = 0;
  protected final Sequence mNum;
  protected final Sequence mDen;

  /**
   * Create the quotient sequence of a sequence.
   * @param num sequence for the numerator
   * @param den sequence for the denominator
   * @param skipNum number of initial terms to be skipped in the numerator
   * @param skipDen number of initial terms to be skipped in the denominator
   */
  public QuotientSequence(final Sequence num, final Sequence den, final int skipNum, final int skipDen) {
    this(DEFOFF, num, den, skipNum, skipDen);
  }

  /**
   * Create the quotient sequence of a sequence.
   * @param num sequence for the numerator
   * @param den sequence for the denominator
   */
  public QuotientSequence(final Sequence num, final Sequence den) {
    this(DEFOFF, num, den, 0, 0);
  }

  /**
   * Create the quotient sequence of a sequence.
   * @param offset first index
   * @param num sequence for the numerator
   * @param den sequence for the denominator
   */
  public QuotientSequence(final int offset, final Sequence num, final Sequence den) {
    this(offset, num, den, 0, 0);
  }

  /**
   * Create the quotient sequence of a sequence.
   * @param offset first index
   * @param num sequence for the numerator
   * @param den sequence for the denominator
   * @param skipNum number of initial terms to be skipped in the numerator
   * @param skipDen number of initial terms to be skipped in the denominator
   */
  public QuotientSequence(final int offset, final Sequence num, final Sequence den, int skipNum, int skipDen) {
    super(offset);
    mNum = num;
    mDen = den;
    while (--skipNum >= 0) {
      mNum.next();
    }
    while (--skipDen >= 0) {
      mDen.next();
    }
  }

  @Override
  public Z next() {
    return mNum.next().divide(mDen.next());
  }
}
