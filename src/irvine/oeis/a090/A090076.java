package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A090076 a(n) = prime(n)*prime(n+2).
 * @author Sean A. Irvine
 */
public class A090076 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.multiply(t);
  }
}

