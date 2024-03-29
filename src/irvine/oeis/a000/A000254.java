package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000254 Unsigned Stirling numbers of first kind, s(n+1,2): a(n+1) = (n+1)*a(n) + n!.
 * @author Sean A. Irvine
 */
public class A000254 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000254(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000254() {
    super(0);
  }

  protected long mN = -1;
  private Z mA = Z.ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (mN == 1) {
      return Z.ONE;
    }
    mF = mF.multiply(mN - 1);
    mA = mA.multiply(mN).add(mF);
    return mA;
  }

}

