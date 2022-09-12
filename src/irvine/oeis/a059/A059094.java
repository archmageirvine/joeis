package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059094 Numbers whose sum of digits is a cube.
 * @author Sean A. Irvine
 */
public class A059094 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long d = ZUtils.digitSum(++mN);
      final long r = Z.valueOf(d).root(3).longValue();
      if (r * r * r == d) {
        return Z.valueOf(mN);
      }
    }
  }
}
