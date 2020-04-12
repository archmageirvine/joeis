package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031165 <code>a(n) = prime(n+3) - prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A031165 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mC;
    mC = super.next();
    return mC.subtract(t);
  }
}
