package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A022451 a(1) = 3; a(n+1) = a(n)-th composite.
 * @author Sean A. Irvine
 */
public class A022451 extends A002808 {

  private Z mN = Z.ZERO;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
    } else {
      final Z t = mA;
      while (mN.compareTo(t) < 0) {
        mN = mN.add(1);
        mA = super.next();
      }
    }
    return mA;
  }
}
