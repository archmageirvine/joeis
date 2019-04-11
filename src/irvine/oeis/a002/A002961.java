package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002961 Numbers n such that n and <code>n+1</code> have same sum of divisors.
 * @author Sean A. Irvine
 */
public class A002961 implements Sequence {

  private long mN = 13;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z sum = Cheetah.factor(++mN).sigma();
      final boolean res = sum.equals(mPrev);
      mPrev = sum;
      if (res) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
