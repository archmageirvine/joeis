package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079428 Least coprime number m &gt; n with same number of divisors as n, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A079428 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long s0 = Functions.SIGMA0.l(mN);
    long m = mN;
    while (true) {
      if (Functions.GCD.l(++m, mN) == 1 && Functions.SIGMA0.l(m) == s0) {
        return Z.valueOf(m);
      }
    }
  }
}

