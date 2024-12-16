package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A060778 a(n) = gcd(tau(n+1), tau(n)), where tau = A000005.
 * @author Sean A. Irvine
 */
public class A060778 extends A000005 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.gcd(mA);
  }
}
