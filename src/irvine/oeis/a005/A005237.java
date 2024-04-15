package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005237 Numbers k such that k and k+1 have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A005237 extends Sequence1 {

  private long mN = 1;
  private long mPrev = 1;

  @Override
  public Z next() {
    while (true) {
      final long sigma0 = Functions.SIGMA0.l(++mN);
      if (mPrev == sigma0) {
        return Z.valueOf(mN - 1);
      }
      mPrev = sigma0;
    }
  }
}
