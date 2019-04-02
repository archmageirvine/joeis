package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A013947 Positions of 1's in Kolakoski sequence (A000002).
 * @author Sean A. Irvine
 */
public class A013947 extends A000002 {

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
