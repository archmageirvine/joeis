package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000796;
import irvine.oeis.triangle.Triangle;

/**
 * A095709 Triangle of numbers obtained by reversing the first n digits of Pi and juxtaposing.
 * @author Georg Fischer
 */
public class A095709 extends Triangle implements SequenceWithOffset {

  private int mOffset;
  protected final Sequence mSeq;

  /** Construct the sequence. */
  public A095709() {
    this(1, new A000796());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   */
  public A095709(final int offset, final Sequence seq) {
    hasRAM(false);
    mOffset = offset;
    mSeq = seq;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? mSeq.next() : get(n - 1, k - 1);
  }
}
