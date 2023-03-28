package irvine.oeis.a039;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A039771 Numbers k such that phi(k) is a perfect cube.
 * @author Sean A. Irvine
 */
public class A039771 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.isCube(Euler.phi(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
