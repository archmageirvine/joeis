package irvine.oeis;

import irvine.math.z.Z;

/**
 * Sequence formed from a real function of n.
 * @author Georg Fischer
 */
public abstract class FloorSequence implements SequenceWithOffset {

  protected long mN;
  private int mOffset;

  protected FloorSequence(final int offset) {
    mOffset = offset;
    mN = offset - 1;
  }

  /**
   * Evaluate the real function for n
   * @return <code>floor|ceil|round(f(n))</code>
   */
  protected Z evalCR(final long n) {
    return Z.ZERO;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    return evalCR(++mN);
  }
}
