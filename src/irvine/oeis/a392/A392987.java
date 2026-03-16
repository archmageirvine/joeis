package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a174.A174973;

/**
 * A392987 The number of 2-dense numbers &lt;= n where the 2-dense numbers are A174973.
 * @author Sean A. Irvine
 */
public class A392987 extends A174973 {

  private long mA = super.next().longValue();
  private long mN = 0;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    if (mA == ++mN) {
      mM = mM.add(1);
      mA = super.next().longValueExact();
    }
    return mM;
  }
}
