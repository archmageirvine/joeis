package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057870 Number of singular points on n-th order Chmutov surface.
 * @author Sean A. Irvine
 */
public class A057870 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z t;
    switch (mN % 6) {
      case 0:
        t = n.pow(3).multiply(5).subtract(n.square().multiply(13)).add(12L * mN);
        break;
      case 2:
      case 4:
        t = n.pow(3).multiply(5).subtract(n.square().multiply(13)).add(16L * mN - 8);
        break;
      case 1:
      case 5:
        t = n.pow(3).multiply(5).subtract(n.square().multiply(14)).add(13L * mN - 4);
        break;
      default: // 3
        t = n.pow(3).multiply(5).subtract(n.square().multiply(14)).add(9L * mN);
        break;
    }
    return t.divide(12);
  }
}

