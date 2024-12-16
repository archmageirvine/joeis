package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A060780 a(n) = gcd(sigma(n+1), sigma(n)), where sigma = A000203.
 * @author Sean A. Irvine
 */
public class A060780 extends A000203 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.gcd(mA);
  }
}
