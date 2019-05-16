package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A022450 <code>a(1) = 2; a(n+1) = a(n)-th</code> composite.
 * @author Sean A. Irvine
 */
public class A022450 extends A002808 {

  private Z mN = Z.ZERO;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
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
