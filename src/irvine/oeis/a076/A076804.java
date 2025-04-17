package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076804 a(n) = least positive integer k satisfying Omega(k) = Omega(k+1)+Omega(k+2)....+Omega(k+n), where Omega = A001222 = number of prime factors, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076804 extends Sequence1 {

  private int mN = 0;

  private long sum(final long lo, final long hi) {
    long sum = 0;
    for (long k = lo; k <= hi; ++k) {
      sum += Functions.BIG_OMEGA.l(k);
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      ++k;
      if (Functions.BIG_OMEGA.l(k) == sum(k + 1, k + mN)) {
        return Z.valueOf(k);
      }
    }
  }
}

