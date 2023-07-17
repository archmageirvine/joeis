package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006277 a(n) = (a(n-1) + 1)*a(n-2).
 * @author Sean A. Irvine
 */
public class A006277 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006277(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006277() {
    super(0);
  }

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ONE;
    } else {
      final Z t = mB.add(1).multiply(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
