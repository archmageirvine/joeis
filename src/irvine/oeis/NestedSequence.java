package irvine.oeis;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A sequence derived from two nested sequences.
 * @author Georg Fischer
 */
public class NestedSequence implements Sequence {

  private static final int ESTLEN = 1024; // estimated length of arrays
  private final ArrayList<Z> mAs = new ArrayList<>(ESTLEN); // underlying sequence
  protected Sequence mSeqA;
  protected Sequence mSeqB;

  /**
   * Constructor with parameters. 
   * @param offset offset of the resulting sequence
   * @param seqA outer sequence
   * @param seqB inner sequence
   * @param offsetA offset of seqA
   * @param offsetB offset of seqB
   */
  public NestedSequence(final int offset, final Sequence seqA, final Sequence seqB, final int offsetA, final int offsetB) {
    mSeqA = seqA;
    mSeqB = seqB;
    int nA = -1;
    while (++nA < offsetA) {
      mAs.add(Z.ZERO);
    }
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
    final int termB = mSeqB.next().intValueExact();
    while (mAs.size() <= termB) {
      mAs.add(mSeqA.next()); 
    }
    return mAs.get(termB);
  }

}
