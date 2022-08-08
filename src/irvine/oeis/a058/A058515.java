package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A058515 GCD of totients of consecutive integers.
 * @author Sean A. Irvine
 */
public class A058515 extends A000010 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.gcd(mA);
  }
}
