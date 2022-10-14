package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000079;

/**
 * A004094 Powers of 2 written backwards.
 * @author Georg Fischer
 */
public class A004094 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private Sequence mSeq;

  /** Construct the sequence. */
  public A004094() {
    this(0, new A000079());
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param seq
   */
  public A004094(final int offset, final Sequence seq) {
    mN = -1;
    mOffset = offset;
    mSeq = seq;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    return ZUtils.reverse(mSeq.next());
  }
}
