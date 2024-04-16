package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067268 Numbers k such that k and k^2+1 have the same number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A067268 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == Functions.OMEGA.i(mN * mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}

