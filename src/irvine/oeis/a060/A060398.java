package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A060398 Values of k associated with A060397.
 * @author Sean A. Irvine
 */
public class A060398 extends A060380 {

  private long mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    mN += 2;
    final long r = mN % 6;
    if (r == 3) {
      return Z.ZERO;
    } else if (r == 1) {
      return Z.ONE;
    } else {
      long kMax = 2;
      long smallestLpf = Long.MAX_VALUE;
      long bestK = 0;
      long k = -1;
      while (++k <= kMax) {
        final long lpf = Functions.LPF.l(mN + k * k + k);
        if (lpf < smallestLpf) {
          smallestLpf = lpf;
          kMax *= 2;
          bestK = k;
        }
      }
      return Z.valueOf(bestK);
    }
  }
}

