package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002454.
 * @author Sean A. Irvine
 */
public class A002454 implements Sequence {

  private Z mValue = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mValue = mValue.multiply(mN).multiply(mN).shiftLeft(2);
    }
    return mValue;
  }
}
