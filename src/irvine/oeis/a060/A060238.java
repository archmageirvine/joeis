package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060238 a(n) = det(M) where M is an n X n matrix with M[i,j] = lcm(i,j).
 * @author Sean A. Irvine
 */
public class A060238 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Z prod = mF;
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      prod = prod.multiply(Z.valueOf(1 - p).pow(mN / p));
    }
    return prod;
  }
}
