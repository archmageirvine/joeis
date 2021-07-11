package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A048871 Length of hypotenuse squared in right triangle formed by a palindromic spiral plotted in Cartesian coordinates.
 * @author Sean A. Irvine
 */
public class A048871 extends A002113 {

  {
    super.next();
  }
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next().square();
    return mA.add(t);
  }
}

