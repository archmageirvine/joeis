package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064538 a(n) is the smallest positive integer such that a(n)*(1^n + 2^n + ... + x^n) is a polynomial in x with integer coefficients.
 * @author Sean A. Irvine
 */
public class A064538 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.valueOf(mN + 1);
    final long lim = (mN + 2) / (2 + (mN & 1));
    for (long p = 2; p <= lim; p = mPrime.nextPrime(p)) {
      if (Functions.DIGIT_SUM.l(p, mN + 1) >= p) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}

