package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038702 Prime(n)^2 mod prime(n-1).
 * @author Sean A. Irvine
 */
public class A038702 extends A000040 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.square().mod(t);
  }
}
