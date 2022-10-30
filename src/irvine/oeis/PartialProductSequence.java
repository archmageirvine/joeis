package irvine.oeis;

import irvine.math.z.Z;

/**
 * Partial products of another sequence.
 * @author Sean A. Irvine
 */
public class PartialProductSequence extends AbstractSequence {

  private final Sequence mSeq;
  protected Z mProduct = Z.ONE;

  /**
   * Partial products of another sequence.
   * @param offset sequence offset
   * @param seq sequence to compute partial products of
   */
  public PartialProductSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  /**
   * Partial products of another sequence.
   * @param seq sequence to compute partial products of
   */
  public PartialProductSequence(final Sequence seq) {
    this(0, seq);
  }

  @Override
  public Z next() {
    mProduct = mProduct.multiply(mSeq.next());
    return mProduct;
  }
}
