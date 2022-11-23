package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A060397 Smallest prime that divides k^2 + k + 2n + 1 for k = 0,1,2,....
 * @author Sean A. Irvine
 */
public class A060397 extends A060380 {

  private long mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    mN += 2;
    final long r = mN % 6;
    if (r == 1 || r == 3) {
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

