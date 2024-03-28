package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a007.A007947;

/**
 * A005730 Related to n-th powers of polynomials.
 * @author Sean A. Irvine
 */
public class A005730 extends A007947 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = super.next();
    return mPrime.isPrime(++mN) ? Z.ONE : mN % 6 == 0 ? t.multiply2() : t;
  }
}
