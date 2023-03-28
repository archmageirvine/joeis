package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A020477 Numbers whose sum of divisors is a cube.
 * @author Sean A. Irvine
 */
public class A020477 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.isCube(Jaguar.factor(++mN).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
