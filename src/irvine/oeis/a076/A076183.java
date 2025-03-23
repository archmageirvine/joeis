package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071609.
 * @author Sean A. Irvine
 */
public class A076183 extends Sequence1 {

  private int mN = 0;

  private boolean is(final int n, final long k) {
    long omega = Functions.BIG_OMEGA.l(k);
    for (int j = 1; j <= n && omega >= 0; ++j) {
      omega -= Functions.BIG_OMEGA.l(k - j);
    }
    return omega == 0;
  }

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    while (true) {
      if (is(mN, ++k)) {
        return Z.valueOf(k);
      }
    }
  }
}
