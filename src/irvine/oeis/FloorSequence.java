package irvine.oeis;

import irvine.math.z.Z;

/**
 * Sequence formed from a real function of n.
 * @author Georg Fischer
 */
public abstract class FloorSequence implements Sequence {

  protected long mN;

  protected FloorSequence(final int offset) {
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
  public Z next() {
    return evalCR(++mN);
  }
}
