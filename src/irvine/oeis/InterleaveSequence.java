package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence alternating between the values of other sequences.  For example, can be used
 * to interleave a sequence of odd and even terms.
 * @author Sean A. Irvine
 */
public class InterleaveSequence extends AbstractSequence {

  private final Sequence[] mSequences;
  private int mN = -1;

  /**
   * Create a sequence interleaving the given sequences.
   * @param offset first index
   * @param sequences sequences to interleave
   */
  public InterleaveSequence(final int offset, final Sequence... sequences) {
    super(offset);
    mSequences = sequences;
  }

  /**
   * Create a sequence interleaving two other sequences.
   * @param seqA first sequence
   * @param seqB second sequence
   */
  public InterleaveSequence(final Sequence seqA, final Sequence seqB) {
    this(seqA.getOffset(), seqA, seqB);
  }

  @Override
  public Z next() {
    if (++mN == mSequences.length) {
      mN = 0;
    }
    return mSequences[mN].next();
  }
}
