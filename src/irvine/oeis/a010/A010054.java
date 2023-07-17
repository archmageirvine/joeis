package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010054 a(n) = 1 if n is a triangular number, otherwise 0.
 * @author Sean A. Irvine
 */
public class A010054 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A010054(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A010054() {
    super(0);
  }

  private long mNext = 0;
  private long mM = 0;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == mNext) {
      mNext = ++mM * (mM + 1) / 2;
      return Z.ONE;
    }
    return Z.ZERO;
  }
}

