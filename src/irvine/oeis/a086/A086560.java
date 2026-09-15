package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086560 Start of first run of n successive numbers in which i-th number has exactly i distinct prime divisors for i = 1..n.
 * @author Sean A. Irvine
 */
public class A086560 extends Sequence1 {

  private int mN = 0;
  private long mM = 2;

  private boolean is(final long m, final int n) {
    for (int k = 1; k <= n; ++k) {
      if (Functions.OMEGA.i(m + k - 1) != k) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM, mN)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
