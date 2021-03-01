package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A039920 Concatenation of e's decimal digits.
 * @author Sean A. Irvine
 */
public class A039920 extends A001113 {

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
