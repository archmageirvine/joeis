package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000522;
import irvine.oeis.memory.MemorySequence;

/**
 * A072453 Shadow transform of A000522.
 * @author Georg Fischer
 */
public class A072453 extends AbstractSequence {

  private int mN;
  private final MemorySequence mSeq;
  private final int mOffset;
  private final int mDist;

  /** Construct the sequence. */
  public A072453() {
    this(0, new A000522(), 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param dist distance where to begin the transform
   */
  public A072453(final int offset, final AbstractSequence seq, final int dist) {
    super(offset);
    mN = offset - 1;
    mDist = dist;
    mOffset = offset;
    mSeq = MemorySequence.cache(0, seq);
  }

  @Override
  public Z next() {
    ++mN;
    int sum = 0;
    for (int i = 0; i < mN; ++i) {
      if (mSeq.a(i + mDist).mod(mN) == 0) {
        ++sum;
      }
    }
    return Z.valueOf(sum);
  }
}
