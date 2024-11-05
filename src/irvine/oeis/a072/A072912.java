package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A072912 Number of Fibonacci numbers F(k) &lt;= 10^n which end in 0.
 * @author Sean A. Irvine
 */
public class A072912 extends A000045 {

  private Z mF = super.next();
  private long mCount = 0;
  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    while (mF.compareTo(mN) <= 0) {
      if (mF.mod(10) == 0) {
        ++mCount;
        }
      mF = super.next();
    }
    return Z.valueOf(mCount);
  }
}

