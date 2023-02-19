package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a005.A005101;

/**
 * A061496 a(n) = gcd(abundant(n), abundant(n+1)) where abundant(n) is the n-th abundant number.
 * @author Sean A. Irvine
 */
public class A061496 extends A005101 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.gcd(mA);
  }
}

