package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A058032 Largest m such that 2^n / primorial(m) &gt;= 1.
 * @author Sean A. Irvine
 */
public class A058032 extends A002110 {

  private Z mA = null;
  private Z mPrimorial = Z.ZERO;
  private long mM = -2;
  {
    next();
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    while (mPrimorial.compareTo(mA) <= 0) {
      mPrimorial = super.next();
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
