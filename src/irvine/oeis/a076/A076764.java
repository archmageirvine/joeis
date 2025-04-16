package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076764 n such that Omega(n-1) &lt; Omega(n) &lt; Omega(n+1), where Omega(m) = the number of prime factors of m, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076764 extends Sequence1 {

  private long mN = 61;

  private boolean is(final long n) {
    final long omega = Functions.BIG_OMEGA.l(n);
    return Functions.BIG_OMEGA.l(n - 1) < omega && omega < Functions.BIG_OMEGA.l(n + 1);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
