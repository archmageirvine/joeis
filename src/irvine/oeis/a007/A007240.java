package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000521;

/**
 * A007240 McKay-Thompson series of class 1A for the Monster group with a(0) = 24.
 * @author Sean A. Irvine
 */
public class A007240 extends A000521 {

  @Override
  public Z next() {
    final Z a = super.next();
    return mN == 0 ? a.subtract(720) : a;
  }
}
