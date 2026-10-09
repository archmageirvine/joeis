package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086824 Least positive k such that k! &gt;= n^k.
 * @author Sean A. Irvine
 */
public class A086824 extends Sequence0 {

  private Z mF = Z.ONE;
  private long mK = 1;
  private long mN = -1;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN).pow(mK);
    while (true) {
      if (mF.compareTo(t) >= 0) {
        return Z.valueOf(mK);
      }
      mF = mF.multiply(++mK);
      t = t.multiply(mN);
    }
  }
}

