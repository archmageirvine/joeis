package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a005.A005349;

/**
 * A060291 Number of twin Harshads, including overlaps, whose sum is prime and where the 2nd Harshad is &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A060291 extends A005349 {

  private Z mA = super.next();
  private Z mLim = Z.ONE;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    while (mA.compareTo(mLim) < 0) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).equals(Z.ONE)) {
        final Z u = mA.add(t);
        if (u.isProbablePrime()) {
          ++mCount;
        }
      }
    }
    return Z.valueOf(mCount);
  }
}
