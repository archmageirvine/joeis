package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087280 Solutions k of max(m+d(m)) = k+2 for m&lt;k; d(m) is the number of divisors of m.
 * @author Sean A. Irvine
 */
public class A087280 extends Sequence1 {

  private long mN = 1;
  private long mMax = 2;

  @Override
  public Z next() {
    while (true) {
      mMax = Math.max(mMax, mN + Functions.SIGMA0.l(mN));
      if (mMax == ++mN + 2) {
        return Z.valueOf(mN);
      }
    }
  }
}

