package irvine.oeis;

import irvine.math.z.Z;

/**
 * Wrapper class used by <code>PolynomialFieldSequence</code> to wrap a sequence
 * which is to be treated as an exponential generating function.
 * @author Georg Fischer
 */
public class EgfWrapper implements Sequence {

  private final Sequence mSeq;

  /**
   * Wrap a sequence.
   * @param seq the sequence
   */
  public EgfWrapper(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public int getOffset() {
    return mSeq.getOffset();
  }

  @Override
  public Z next() {
    return mSeq.next();
  }

  @Override
  public Sequence skip(final long terms) {
    if (terms < 0) {
      throw new IllegalArgumentException();
    }
    for (long k = 0; k < terms; ++k) {
      if (mSeq.next() == null) {
        return mSeq;
      }
    }
    return mSeq;
  }

  @Override
  public Sequence skip() {
    return skip(1);
  }

  /**
   * Wrap method used by <code>PolynomialFieldSequence</code>.
   * @param seq sequence to be treated as exponential generating function
   * @return resulting instance that can be tested with <code>instanceof EgfWrapper</code>
   */
  public static EgfWrapper wrap(final Sequence seq) {
    return new EgfWrapper(seq);
  }

  /**
   * Get the underlying sequence.
   * @return the underlying sequence
   */
  public Sequence getSequence() {
    return mSeq;
  }
}

