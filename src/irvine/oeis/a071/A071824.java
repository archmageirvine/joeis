package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071824 Number of integers &lt;= n whose largest prime factor is of the form 4*k+1.
 * @author Sean A. Irvine
 */
public class A071824 extends A071821 {

  private long mA = super.next().longValueExact();
  private Z mM = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mA) {
      mA = super.next().longValueExact();
      mM = mM.add(1);
    }
    return mM;
  }
}
