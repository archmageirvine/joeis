package irvine.oeis;

import irvine.math.z.Z;

/**
 * Wrapper class used by <code>PolynomialFieldSequence</code> to wrap a sequence
 * which is to be treated as an exponential generating function.
 * @author Georg Fischer
 */
public class EgfWrapper extends AbstractSequence {

  private final Sequence mSeq;

  /**
   * Wrap a sequence.
   * @param seq the sequence
   */
  public EgfWrapper(final Sequence seq) {
    super(seq.getOffset());
    mSeq = seq;
  }

  @Override
  public Z next() {
    return mSeq.next();
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

