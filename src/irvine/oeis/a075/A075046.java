package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075046 a(n) = the smallest number k such that the number of divisors of the n numbers from k through k+n-1 are in nondescending order.
 * @author Sean A. Irvine
 */
public class A075046 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  private boolean is(final long k, final long n) {
    Z s = Functions.SIGMA0.z(k);
    for (long j = 1; j < n; ++j) {
      final Z t = Functions.SIGMA0.z(k + j);
      if (t.compareTo(s) < 0) {
        return false;
      }
      s = t;
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mM, mN)) {
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}

