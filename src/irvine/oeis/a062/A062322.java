package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A062322 Factorials of nonsquarefree numbers, or A013929(n)!, (including 1).
 * @author Sean A. Irvine
 */
public class A062322 extends A013929 {

  private Z mF = null;
  private long mN = 2;

  @Override
  public Z next() {
    if (mF == null) {
      mF = Z.ONE;
      return Z.ONE;
    }
    final long t = super.next().longValueExact();
    while (mN <= t) {
      mF = mF.multiply(mN);
      ++mN;
    }
    return mF;
  }
}
