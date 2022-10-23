package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006073 Numbers n such that n, n+1 and n+2 all have same number of distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A006073 extends Sequence1 {

  protected long mN = 3;
  private long mA = 1;
  private long mB = 1;

  @Override
  public Z next() {
    while (true) {
      final long next = Jaguar.factor(++mN).omega();
      if (next == mB && mA == mB) {
        return Z.valueOf(mN - 2);
      }
      mA = mB;
      mB = next;
    }
  }
}
