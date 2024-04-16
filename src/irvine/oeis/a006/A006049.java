package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006049 Numbers k such that k and k+1 have the same number of distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A006049 extends Sequence1 {

  private long mN = 2;
  private long mPrev = 1;

  @Override
  public Z next() {
    while (true) {
      final long next = Functions.OMEGA.i(++mN);
      if (next == mPrev) {
        return Z.valueOf(mN - 1);
      }
      mPrev = next;
    }
  }
}
