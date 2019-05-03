package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A020755 Increasing gaps between squarefree numbers (upper end).
 * @author Sean A. Irvine
 */
public class A020755 extends A005117 {

  private Z mA = super.next();
  private long mBiggestGap = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final long delta = mA.subtract(t).longValueExact();
      if (delta > mBiggestGap) {
        mBiggestGap = delta;
        return mA;
      }
    }
  }
}
