package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A013643 Numbers k such that the continued fraction for sqrt(k) has period 3.
 * @author Sean A. Irvine
 */
public class A013643 extends A003285 {

  @Override
  public Z next() {
    while (true) {
      if (Z.THREE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
