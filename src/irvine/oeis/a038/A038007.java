package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a033.A033178;

/**
 * A038007 Even numbers k such that b(k) is greater than b(k-1) and b(k+1); b(k) = A033178(k).
 * @author Sean A. Irvine
 */
public class A038007 extends A033178 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      mB = super.next();
    }
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if ((mN & 1) == 1 && mA.compareTo(t) > 0 && mA.compareTo(mB) > 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
