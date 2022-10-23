package irvine.oeis.a055;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055394 Numbers that are the sum of a positive square and a positive cube.
 * @author Sean A. Irvine
 */
public class A055394 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long k = 1, t; (t = mN - k * k * k) > 0; ++k) {
        final long s = LongUtils.sqrt(t);
        if (s * s == t) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
