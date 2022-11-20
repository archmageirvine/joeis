package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A060395 Smallest prime that divides k^2 + k + n for k = 0, 1, 2, ....
 * @author Sean A. Irvine
 */
public class A060395 extends A060380 {

  private long mN = -1;

  @Override
  public Z next() {
    final long r = ++mN % 6;
    if (r == 0 || r == 2 || r == 4) {
      return Z.TWO;
    } else if (r == 1 || r == 3) {
      return Z.THREE;
    } else {
      long kMax = 2;
      long smallestLpf = Long.MAX_VALUE;
      long k = -1;
      while (++k <= kMax) {
        final long lpf = Jaguar.factor(mN + k * k + k).leastPrimeFactor().longValue();
        if (lpf < smallestLpf) {
          smallestLpf = lpf;
          kMax *= 2;
        }
      }
      return Z.valueOf(smallestLpf);
    }
  }
}

