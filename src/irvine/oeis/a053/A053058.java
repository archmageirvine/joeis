package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000578;
import irvine.oeis.a009.A009421;

/**
 * A053058 Cubes whose digit sum is also a cube.
 * @author Sean A. Irvine
 */
public class A053058 extends A000578 {

  @Override
  public Z next() {
    while (true) {
      final Z cube = super.next();
      final long d = ZUtils.digitSum(cube);
      if (A009421.isCube(Z.valueOf(d))) {
        return cube;
      }
    }
  }
}
