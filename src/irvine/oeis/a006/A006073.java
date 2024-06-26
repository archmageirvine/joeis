package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006073 Numbers k such that k, k+1 and k+2 all have the same number of distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A006073 extends Sequence1 {

  protected long mN = 3;
  private long mA = 1;
  private long mB = 1;

  @Override
  public Z next() {
    while (true) {
      final long next = Functions.OMEGA.i(++mN);
      if (next == mB && mA == mB) {
        return Z.valueOf(mN - 2);
      }
      mA = mB;
      mB = next;
    }
  }
}
