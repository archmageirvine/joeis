package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076253 a(n) = the least positive integer solution of the "n-th omega recurrence" omega(k) = omega(k-1) + ... + omega(k-n), if such k exists; = 0 otherwise. (omega(n) denotes the number of distinct prime factors of n.).
 * @author Sean A. Irvine
 */
public class A076253 extends Sequence1 {

  private long mN = 0;
  private long mM = 3;

  private boolean is(final long n, final long m) {
    if (m <= n) {
      return false;
    }
    long omega = Functions.OMEGA.i(m);
    for (long k = 1; k <= n; ++k) {
      omega -= Functions.OMEGA.i(m - k);
      if (omega < 0) {
        return false;
      }
    }
    return omega == 0;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mN, mM)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
