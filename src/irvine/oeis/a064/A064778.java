package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064778 Largest m such that 1..m all divide n!.
 * @author Sean A. Irvine
 */
public class A064778 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  private boolean is(final long m, final long n) {
    long f = 1;
    for (long k = 2; k <= n; ++k) {
      f *= k;
      f %= m;
      if (f == 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    while (is(mM + 1, mN)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
