package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006049 Numbers n such that n and n+1 have the same number of distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A006049 implements Sequence {

  private long mN = 2;
  private long mPrev = 1;

  @Override
  public Z next() {
    while (true) {
      final long next = Cheetah.factor(++mN).omega();
      if (next == mPrev) {
        return Z.valueOf(mN - 1);
      }
      mPrev = next;
    }
  }
}
