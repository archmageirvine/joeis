package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000522;

/**
 * A006231.
 * @author Sean A. Irvine
 */
public class A006231 extends A000522 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.add(super.next()).subtract(1);
    return mA;
  }
}
