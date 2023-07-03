package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064379.
 * @author Sean A. Irvine
 */
public class A064383 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long s = 1 % mN;
      long f = 1;
      long sign = -1;
      for (long k = 1; k < mN; ++k, sign = -sign) {
        f *= k;
        f %= mN;
        if (f == 0) {
          break;
        }
        s += sign * f;
        s %= mN;
      }
      if (s == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
