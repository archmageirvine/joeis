package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005237 Numbers n such that n and n+1 have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A005237 implements Sequence {

  private long mN = 1;
  private long mPrev = 1;

  @Override
  public Z next() {
    while (true) {
      final long sigma0 = Jaguar.factor(++mN).sigma0AsLong();
      if (mPrev == sigma0) {
        return Z.valueOf(mN - 1);
      }
      mPrev = sigma0;
    }
  }
}
