package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.factorial.Factorial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068371 Primes p such that positive values of p - k! are all primes for k &gt; 1.
 * @author Sean A. Irvine
 */
public class A068371 extends A000040 {

  private final Fast mFast = new Fast();

  private boolean is(final long n) {
    for (int k = 2; Factorial.FACTORIAL[k] < n; ++k) {
      if (!mFast.isPrime(n - Factorial.FACTORIAL[k])) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p.longValueExact())) {
        return p;
      }
    }
  }
}

