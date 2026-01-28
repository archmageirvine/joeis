package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a002.A002202;

/**
 * A392633 allocated for Jud McCranie.
 * @author Sean A. Irvine
 */
public class A392633 extends A002202 {

  private Z mA = super.next();
  private Z mGap = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z d = mA.subtract(t);
      if (d.compareTo(mGap) > 0) {
        mGap = d;
        return t;
      }
    }
  }
}
