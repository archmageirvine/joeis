package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003073 A nonlinear recurrence.
 * @author Sean A. Irvine
 */
public class A003073 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int k = ++mN / 3;
    switch (mN % 3) {
      case 0:
        return Z.THREE.shiftLeft(k).divide2().subtract(k > 0 ? 1 : 0);
      case 1:
        return Z.valueOf(53).shiftLeft(k).divide(28).subtract(k > 2 ? 1 : 0);
      default:
        return Z.valueOf(17).shiftLeft(k).divide(14).multiply2().add(k == 2 ? 1 : 0);
    }
  }
}

