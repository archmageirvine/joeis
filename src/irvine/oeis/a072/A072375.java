package irvine.oeis.a072;

import irvine.math.z.Z;

/**
 * A072375 Number of cubefree numbers &lt;= n which are nonsquares having exactly one square in their factorization.
 * @author Sean A. Irvine
 */
public class A072375 extends A072357 {

  private long mA = super.next().longValueExact();
  private long mN = 0;
  private Z mC = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == mA) {
      mC = mC.add(1);
      mA = super.next().longValueExact();
    }
    return mC;
  }
}
