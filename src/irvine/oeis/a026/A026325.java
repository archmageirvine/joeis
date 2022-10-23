package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026325 Number of (s(0), s(1), ..., s(n)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| &lt;= 1 for i = 1,2,...,n, s(0) = 2, s(n) = 2. Also T(n,n), where T is the array in A026323.
 * @author Sean A. Irvine
 */
public class A026325 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.THREE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return mN == 2 ? Z.THREE : Z.ONE;
    }
    final Z t = mC.multiply(4 * mN + 15).subtract(mB.multiply(mN - 3)).subtract(mA.multiply(mN).multiply(6)).divide(mN + 6);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
