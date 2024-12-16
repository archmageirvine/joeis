package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A060779 a(n) = lcm(tau(n+1), tau(n)), where tau = A000005.
 * @author Sean A. Irvine
 */
public class A060779 extends A000005 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.lcm(mA);
  }
}
