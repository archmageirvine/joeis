package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000340 a(0)=1, a(n) = 3*a(n-1) + n + 1.
 * @author Sean A. Irvine
 */
public class A000340 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000340(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000340() {
    super(0);
  }

  protected long mN = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(3).add(++mN);
    return mA;
  }
}
