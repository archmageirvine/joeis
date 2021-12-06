package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053089 a(n) = prime(n)^prime(n+1).
 * @author Sean A. Irvine
 */
public class A053089 extends A000040 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z p = mA;
    mA = super.next();
    return p.pow(mA);
  }
}
