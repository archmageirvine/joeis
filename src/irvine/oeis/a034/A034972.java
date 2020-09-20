package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000182;

/**
 * A034972 a(n) = floor(T_(n+1)/T_(n)) where T_n is n-th tangential or "Zag" number (see A000182).
 * @author Sean A. Irvine
 */
public class A034972 extends A000182 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
