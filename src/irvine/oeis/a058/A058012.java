package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A058010.
 * @author Sean A. Irvine
 */
public class A058012 extends A002808 {

  private Z mN = Z.ZERO;
  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z c = super.next();
      final Z g = mN.gcd(c);
      if (g.compareTo(mMax) > 0) {
        mMax = g;
        return c;
      }
    }
  }
}
