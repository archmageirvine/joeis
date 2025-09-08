package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080170 Numbers k such that gcd(C(2*k,k), C(3*k,k), C(4*k,k), ..., C((k+1)*k,k) ) = 1.
 * @author Sean A. Irvine
 */
public class A080170 extends Sequence1 {

  private long mN = 28;

  private boolean is(final long n) {
    Z d = Binomial.binomial(2 * n, n);
    for (long k = 3; k <= n + 1; ++k) {
      d = Functions.GCD.z(d, Binomial.binomial(k * n, n));
      if (d.isOne()) {
        return true;
      }
    }
    return false;
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

