package irvine.oeis.a242;

import irvine.math.z.Z;
import irvine.oeis.a222.A222208;

/**
 * A222208.
 * @author Sean A. Irvine
 */
public class A242211 extends A222208 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : super.a(mA.intValueExact());
    return mA;
  }
}
