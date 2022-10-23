package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002454 Central factorial numbers: a(n) = 4^n (n!)^2.
 * @author Sean A. Irvine
 */
public class A002454 extends Sequence0 {

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
