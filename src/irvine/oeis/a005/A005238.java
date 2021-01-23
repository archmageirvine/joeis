package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005238 Numbers n such that n, n+1 and n+2 have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A005238 implements Sequence {

  private long mN = 1;
  private long mPrev = 1;

  @Override
  public Z next() {
    while (true) {
      final long sigma0 = Cheetah.factor(++mN).sigma0AsLong();
      if (mPrev == sigma0 && mPrev == Cheetah.factor(mN + 1).sigma0AsLong()) {
        return Z.valueOf(mN - 1);
      }
      mPrev = sigma0;
    }
  }
}
