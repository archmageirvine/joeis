package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085420 For each n, let p(n,b) be the smallest prime in the arithmetic progression k*n+b, with k &gt; 0. Then a(n) = max(p(n,b)) with 0 &lt; b &lt; n and gcd(b,n) = 1.
 * @author Sean A. Irvine
 */
public class A085420 extends Sequence1 {

  // After Charles R Greathouse IV

  private long mN = 0;

  private Z p(final long n, final long b) {
    Z t = Z.valueOf(b + n);
    while (!t.isProbablePrime()) {
      t = t.add(n);
    }
    return t;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    Z t = Z.ZERO;
    for (long b = 1; b < mN; ++b) {
      if (Functions.GCD.l(b, mN) == 1) {
        t = t.max(p(mN, b));
      }
    }
    return t;
  }
}

