package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A064933 Numbers k such that the period of the continued fraction for sqrt(3)*k is 2.
 * @author Sean A. Irvine
 */
public class A064933 extends A003285 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (period(Z.THREE.multiply(++mN * mN)).equals(Z.TWO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
