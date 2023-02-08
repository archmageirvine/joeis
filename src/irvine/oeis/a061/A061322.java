package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a003.A003504;

/**
 * A061322 a(n) = a(n-1) * (1 + a(n-1)/n^2) with a(0) = 2.
 * @author Sean A. Irvine
 */
public class A061322 extends A003504 {

  private Z mA = Z.ONE;
  {
    super.next();
  }

  @Override
  public Z next() {
    mA = mA.add(super.next().square());
    return mA;
  }
}
