package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.a246.A246547;

/**
 * A031218 Largest prime power &lt;= n.
 * @author Sean A. Irvine
 */
public class A167185 extends A246547 {

  private Z mB = Z.ONE;
  private Z mA = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mA)) {
      mB = mA;
      mA = super.next();
    }
    return mB;
  }
}
