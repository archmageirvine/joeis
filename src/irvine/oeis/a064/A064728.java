package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064728 Solutions to A064494(n) = 2(n+1).
 * @author Sean A. Irvine
 */
public class A064728 extends A064494 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().longValueExact() == 2 * mN + 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
