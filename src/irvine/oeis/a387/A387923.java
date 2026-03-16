package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A387923 Greatest common divisor of consecutive powerful numbers.
 * @author Sean A. Irvine
 */
public class A387923 extends A001694 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.gcd(t);
  }
}

