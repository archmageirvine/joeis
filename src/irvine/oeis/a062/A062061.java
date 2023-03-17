package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062061 Numbers k such that prime(k)+1 divides k^2.
 * @author Sean A. Irvine
 */
public class A062061 extends A000040 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().mod(super.next().add(1)).isZero()) {
        return mN;
      }
    }
  }
}

