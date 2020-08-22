package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a014.A014532;

/**
 * A025568 a(n) = T(n,n+2) where T is the array defined in A025564.
 * @author Sean A. Irvine
 */
public class A025568 extends A014532 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}
