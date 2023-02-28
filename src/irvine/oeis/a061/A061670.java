package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A061670 Distance to nearest prime power p^k, k=0 and k &gt;= 2 (A025475).
 * @author Sean A. Irvine
 */
public class A061670 extends A025475 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z a = mA.subtract(mN).abs();
    final Z b = mB.subtract(mN).abs();
    if (b.compareTo(a) < 0) {
      mA = mB;
      mB = super.next();
      return b;
    }
    return a;
  }
}

