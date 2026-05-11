package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A084790 Increasing gaps between 3-smooth numbers (upper end).
 * @author Sean A. Irvine
 */
public class A084790 extends A003586 {

  private Z mGap = Z.ZERO;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z d = mA.subtract(t);
      if (d.compareTo(mGap) > 0) {
        mGap = d;
        return mA;
      }
    }
  }
}
