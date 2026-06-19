package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000108;

/**
 * A130918 Simple self-inverse permutation of natural numbers: List each block of A000108(n) numbers from A014137(n-1) to A014138(n-1) in reverse order.
 * @author Georg Fischer
 */
public class A130918 extends AbstractSequence {

  private long mN;
  private long mStart;
  private Z mBlock; // block length from seq(k) 
  private long mLimit; // = - mBLock + 1
  private long mShift; // add so much to mN, steps down by 2
  private Sequence mSeq;

  /** Construct the sequence. */
  public A130918() {
    this(0, new A000108());
  }

  /**
   * Generic constructor with parameters and default start 0
   * @param offset first index
   * @param seq underlying sequence that gives the block lengths
   */
  public A130918(final int offset, final Sequence seq) {
    this(offset, seq, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence that gives the block lengths
   * @param start start of first block of natural numbers (before reversing)
   */
  public A130918(final int offset, final Sequence seq, final long start) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mStart = start;
    mBlock = mSeq.next();
    while (mBlock.isZero()) { // ignore block of length 0
      mBlock = mSeq.next();
    }
    mLimit = mN + 1 + mBlock.longValueExact();
    mShift = mBlock.longValueExact() + 1;
  }

  @Override
  public Z next() {
    while (true) {
      while (++mN < mLimit) {
        mShift -= 2;
        return Z.valueOf(mN + mShift);
      }
      mBlock = mSeq.next();
      while (mBlock.isZero()) { // ignore block of length 0
        mBlock = mSeq.next();
      }
      mLimit = mN + mBlock.longValueExact();
      mShift = mBlock.longValueExact() + 1;
      --mN;
    }
  }
}
