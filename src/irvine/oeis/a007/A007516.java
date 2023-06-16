package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007516 (2^2^...^2) (n times) + 1.
 * @author Sean A. Irvine
 */
public class A007516 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    mA = Z.ONE.shiftLeft(mA.longValueExact());
    return mA.add(1);
  }
}
