package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A063446 Integers m such that d(m+1) = 2d(m) where d=A000005.
 * @author Sean A. Irvine
 */
public class A063446 extends A000005 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z b = mA;
      mA = super.next();
      if (b.multiply2().equals(mA)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
