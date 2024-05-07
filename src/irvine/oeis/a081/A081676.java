package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A081676 Largest perfect power &lt;= n.
 * @author Sean A. Irvine
 */
public class A081676 extends A001597 {

  private long mA = 0;
  private long mB = super.next().longValueExact();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mB <= mN) {
      mA = mB;
      mB = super.next().longValueExact();
    }
    return Z.valueOf(mA);
  }
}
