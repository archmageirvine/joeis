package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A031218 Largest prime power <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A031218 extends A000961 {

  private Z mB = Z.ZERO;
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
