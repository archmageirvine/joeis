package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072664 End of smallest run of n consecutive integers with n, n-1, ..., 1 distinct prime factors in that order.
 * @author Sean A. Irvine
 */
public class A072664 extends Sequence1 {

  private int mN = 0;
  private long mM = 1;

  private boolean is(final long m) {
    for (int k = 1; k <= mN; ++k) {
      if (Functions.OMEGA.i(m + 1 - k) != k) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(++mM)) {
        return Z.valueOf(mM);
      }
    }
  }
}
