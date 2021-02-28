package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A039916 Concatenation of the decimal digits of Pi-3.
 * @author Sean A. Irvine
 */
public class A039916 extends A000796 {

  private Z mA = Z.ZERO;
  {
    super.next(); // skip 3
  }

  @Override
  public Z next() {
    mA = mA.multiply(10).add(super.next());
    return mA;
  }
}
