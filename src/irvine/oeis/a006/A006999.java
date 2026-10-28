package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006999 a(n) = floor((3*a(n-1)+2)/2) with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A006999 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.multiply(3).add(2).divide2();
    return mA;
  }
}
