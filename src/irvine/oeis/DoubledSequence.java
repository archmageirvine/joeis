package irvine.oeis;

import irvine.math.z.Z;

/**
 * Create this sequence from the terms of another sequence by repeating them once.
 * @author Georg Fischer
 */
public class DoubledSequence extends AbstractSequence {

  private final Sequence mSeq; // underlying sequence whose terms are to
  private int mN; // 
  private int mILen;
  private Z mA;
  private Z[] mInits;

  /**
   * Double another sequence.
   * @param offset first index
   * @param seq sequence to be repeated
   */
  public DoubledSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mN = -1;
    mInits = new Z[0];
  }

  /**
   * Double another sequence. 
   * The parameter order is similar to that of <em>PrependSequence</em>.
   * @param offset first index
   * @param skip number of terms in <em>skip</em> that are to be skipped 
   * @param seq sequence to be repeated
   */
  public DoubledSequence(final int offset, int skip, final Sequence seq) {
    super(offset);
    mSeq = seq;
    while (skip > 0) {
      mSeq.next();
      --skip;
    }
    mILen = 0;
    mInits = new Z[0];
    mN = -1;
  }

  /**
   * Double another sequence. 
   * The parameter order is similar to that of <em>PrependSequence</em>.
   * @param offset first index
   * @param skip number of terms in <em>skip</em> that are to be skipped 
   * @param seq sequence to be repeated
   * @param inits initial terms to be prepended to the resulting sequence
   */
  public DoubledSequence(final int offset, int skip, final Sequence seq, final long... inits) {
    super(offset);
    mSeq = seq;
    while (skip > 0) {
      mSeq.next();
      --skip;
    }
    mILen = inits.length;
    mInits = new Z[mILen];
    for (int i = 0; i < inits.length; ++i) {
      mInits[i] = Z.valueOf(inits[i]);
    }
    mN = -1;
  }

  
  @Override
  public Z next() {
    ++mN;
    if (mN < mILen) {
      final Z result = mInits[mN];
      if (mN == mILen - 1) {
        mN = 2 * mN + 1; // make it odd
      }
      return result;
    }
    if ((mN & 1) == 0) {
      mA = mSeq.next();
    }
    return mA;
  }
}
