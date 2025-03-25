package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076183 a(n) = the least positive integer k satisfying Omega(k) = Omega(k-1)+...+Omega(k-n) if such k exists; = 0 otherwise. (Omega(n) (A001222) denotes the number of prime factors of n, counting multiplicity.).
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
