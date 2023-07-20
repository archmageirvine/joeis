package irvine.oeis;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A sequence derived from two nested sequences.
 * @author Georg Fischer
 */
public class NestedSequence extends AbstractSequence {

  protected MemorySequence mSeqA;
  protected Sequence mSeqB;
  private final int mOffsetA;

  /**
   * Constructor with parameters. 
   * @param offset offset of the resulting sequence
   * @param seqA outer sequence
   * @param seqB inner sequence
   * @param offsetA offset of sequence A
   * @param offsetB offset of sequence B
   */
  public NestedSequence(final int offset, final Sequence seqA, final Sequence seqB, final int offsetA, final int offsetB) {
    super(offset);
    mSeqA = MemorySequence.cachedSequence(seqA);
    mSeqB = seqB;
    mOffsetA = offsetA;
    int nB = offsetB - 1;
    while (++nB < offset) {
      mSeqB.next(); // skip some of seqB
    }
    if (nB != offset) {
      throw new RuntimeException("offsets do not match: this=" + offset + ", seqB=" + offsetB);
    }
  }

  @Override
  public Z next() {
    return mSeqA.a(mSeqB.next().intValueExact() - mOffsetA);
  }
}
