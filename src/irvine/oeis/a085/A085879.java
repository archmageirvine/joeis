package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085879 Smallest n-th power k^n == 1 (mod 10), where k&gt;1.
 * @author Sean A. Irvine
 */
public class A085879 extends Sequence1 {

  private static final Z Z11 = Z.valueOf(11);
  private int mN = 0;

  @Override
  public Z next() {
    switch (++mN & 3) {
      case 0:
        return Z.THREE.pow(mN);
      case 2:
        return Z.NINE.pow(mN);
      default:
        return Z11.pow(mN);
    }
  }
}
