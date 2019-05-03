package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000708 <code>a(n) = E(n+1)-2E(n)</code>, where <code>E(i)</code> is the Euler number <code>A000111(i)</code>.
 * @author Sean A. Irvine
 */
public class A000708 extends A000111 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z b = mA;
    mA = super.next();
    return mA.subtract(b.multiply2());
  }
}
