package irvine.oeis;

import irvine.math.z.Z;

/**
 * Pad out another sequence with zeros between terms.
 * @author Sean A. Irvine
 */
public class ZeroSpacedSequence implements Sequence {

  private final Sequence mSeq;
  private final int mZeros;
  private int mM = 0;

  /**
   * Construct the sequence.
   * @param seq underlying sequence
   * @param zeros number of zeros to put between consecutive terms
   */
  public ZeroSpacedSequence(final Sequence seq, final int zeros) {
    mSeq = seq;
    mZeros = zeros;
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mZeros;
      return mSeq.next();
    }
    return Z.ZERO;
  }
}

