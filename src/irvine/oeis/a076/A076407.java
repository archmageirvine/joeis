package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A076407 Sum of perfect powers &lt;= n.
 * @author Sean A. Irvine
 */
public class A076407 extends A001597 {

  private Z mA = super.next();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mA.compareTo(mN) <= 0) {
      mSum = mSum.add(mA);
      mA = super.next();
    }
    return mSum;
  }
}
