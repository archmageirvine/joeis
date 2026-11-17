package irvine.oeis.a232;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000796;

/**
 * A232191 A walk based on the digits of Pi (A000796).
 * In an interval between two digits, insert all digits missing from that interval.
 * @author Georg Fischer
 */
public class A232191 extends AbstractSequence {

  private Sequence mSeq;
  private int mNext;
  private int mCurr;

  /** Construct the sequence. */
  public A232191() {
    this(1, new A000796());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence of digits
   */
  public A232191(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mNext = mSeq.next().intValue();
    mCurr = mNext - 1;
  }

  @Override
  public Z next() {
    if (mCurr > mNext) {
      --mCurr;
    } else if (mCurr < mNext) {
      ++mCurr;
    } else { // ==
      mNext = mSeq.next().intValue();
      if (mCurr > mNext) {
        --mCurr;
      } else if (mCurr < mNext) {
        ++mCurr;
      }
    }
    return Z.valueOf(mCurr);
  }
}

