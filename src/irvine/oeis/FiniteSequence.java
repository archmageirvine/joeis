package irvine.oeis;

import java.util.List;

import irvine.math.z.Z;

/**
 * Base case for certain finite sequence generated verbatim from a list.
 * @author Sean A. Irvine
 */
public class FiniteSequence implements Sequence {

  private final Z[] mSeq;
  private int mN = 0;

  /**
   * Construct the sequence.
   * @param seq the values
   */
  protected FiniteSequence(final long... seq) {
    mSeq = new Z[seq.length];
    for (int k = 0; k < seq.length; ++k) {
      mSeq[k] = Z.valueOf(seq[k]);
    }
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final Z... seq) {
    mSeq = seq;
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final List<Z> seq) {
    mSeq = seq.toArray(new Z[seq.size()]);
  }

  @Override
  public Z next() {
    return mN < mSeq.length ? mSeq[mN++] : null;
  }
}

