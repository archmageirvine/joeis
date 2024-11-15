package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056954 Numbers k such that k^2 divides A056819(k).
 * @author Sean A. Irvine
 */
public class A056954 extends A056819 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod((long) mN * mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
