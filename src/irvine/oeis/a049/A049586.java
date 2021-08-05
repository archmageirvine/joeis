package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A049586 a(n) is the GCD of the cototients (A051953) of n and n+1.
 * @author Sean A. Irvine
 */
public class A049586 extends A051953 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.gcd(t);
  }
}

