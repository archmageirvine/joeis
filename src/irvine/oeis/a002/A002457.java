package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002457 a(n) = (2n+1)!/n!^2.
 * @author Sean A. Irvine
 */
public class A002457 extends AbstractSequence {

  /** Construct the sequence. */
  public A002457() {
    super(0);
  }

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN + 1).multiply2().divide(mN);
    }
    return mA;
  }
}
