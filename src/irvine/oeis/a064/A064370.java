package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064370 Zero, together with positive numbers k such that prime(k) - k is a square.
 * @author Sean A. Irvine
 */
public class A064370 extends A000040 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
      return Z.ZERO;
    }
    while (true) {
      final Z p = super.next();
      if (p.subtract(++mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

