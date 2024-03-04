package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005238 Numbers k such that k, k+1 and k+2 have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A005238 extends Sequence1 {

  private long mN = 1;
  private long mPrev = 1;

  @Override
  public Z next() {
    while (true) {
      final long sigma0 = Jaguar.factor(++mN).sigma0AsLong();
      if (mPrev == sigma0 && mPrev == Jaguar.factor(mN + 1).sigma0AsLong()) {
        return Z.valueOf(mN - 1);
      }
      mPrev = sigma0;
    }
  }
}
