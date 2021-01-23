package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000708 a(n) = E(n+1) - 2*E(n), where E(i) is the Euler number A000111(i).
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
