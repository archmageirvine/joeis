package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001248;

/**
 * A048851 Length of hypotenuse squared in right triangle formed by a prime spiral plotted in Cartesian coordinates.
 * @author Sean A. Irvine
 */
public class A048851 extends A001248 {

  private Z mA = Z.FOUR;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}
