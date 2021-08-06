package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a033.A033178;

/**
 * A038007 Even numbers n such that b(n) is greater than b(n-1) and b(n+1); b(n) = A033178.
 * @author Sean A. Irvine
 */
public class A038007 extends A033178 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
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
