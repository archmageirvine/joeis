package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006073 Numbers n such that n, <code>n+1</code> and <code>n+2</code> all have same number of distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A006073 implements Sequence {

  private long mN = 3;
  private long mA = 1;
  private long mB = 1;

  @Override
  public Z next() {
    while (true) {
      final long next = Cheetah.factor(++mN).omega();
      if (next == mB && mA == mB) {
        return Z.valueOf(mN - 2);
      }
      mA = mB;
      mB = next;
    }
  }
}
