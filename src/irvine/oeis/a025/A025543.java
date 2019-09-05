package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A025543.
 * @author Sean A. Irvine
 */
public class A025543 extends A018252 {

  private Z mL = Z.ONE;

  @Override
  public Z next() {
    mL = mL.lcm(super.next());
    return mL;
  }
}
