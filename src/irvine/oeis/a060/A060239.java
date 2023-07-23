package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a001.A001088;

/**
 * A060239 a(n) = determinant(P*Q)/n! where P, Q are n X n matrices with P[i,j]=lcm(i,j), Q[i,j]=gcd(i,j).
 * @author Sean A. Irvine
 */
public class A060239 extends A001088 {

  {
    super.next();
    setOffset(1);
  }

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = super.next();
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      prod = prod.multiply(Z.valueOf(1 - p).pow(mN / p));
    }
    return prod;
  }
}
