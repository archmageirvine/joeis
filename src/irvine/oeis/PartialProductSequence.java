package irvine.oeis;

import irvine.math.z.Z;

/**
 * Partial products of another sequence.
 * @author Sean A. Irvine
 */
public class PartialProductSequence implements Sequence {

  private final Sequence mSeq;
  protected Z mProduct = Z.ONE;

  /**
   * Partial products of another sequence.
   * @param seq sequence to compute partial products of
   */
  public PartialProductSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    mProduct = mProduct.multiply(mSeq.next());
    return mProduct;
  }
}
