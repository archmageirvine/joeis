package irvine.oeis;

import irvine.math.z.Z;

/**
 * Return the sequence <code>a(n)</code> of quotients of successive terms of the two underlying sequences.
 * @author Georg Fischer
 */
public class QuotientSequence implements Sequence {

  protected final Sequence mNum;
  protected final Sequence mDen;

  /**
   * Create the quotient sequence of a sequence.
   * @param num sequence for the numerator
   * @param den sequence for the denominator
   */
  public QuotientSequence(final Sequence num, final Sequence den) {
    this(num, den, 0, 0);
  }

  /**
   * Create the quotient sequence of a sequence.
   * @param num sequence for the numerator
   * @param den sequence for the denominator
   * @param skipNum number of initial terms to be skipped in the numerator
   * @param skipDen number of initial terms to be skipped in the denominator
   */
  public QuotientSequence(final Sequence num, final Sequence den, int skipNum, int skipDen) {
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
