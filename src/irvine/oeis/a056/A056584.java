package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A056584 Solution to (n^2/a(n))^a(n) = gcd(n^n, Product_{k&lt;n} k^k) where a(n) and n^2/a(n) are integers, or 0 if no such integers exist.
 * @author Sean A. Irvine
 */
public class A056584 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    switch (++mN) {
      case 2:
      case 8:
        return Z.FOUR;
      case 4:
        return Z.ZERO;
      case 9:
        return Z.THREE;
      default:
        if (mPrime.isPrime(mN)) {
          return Z.valueOf(mN).square();
        }
        if ((mN & 1) == 0 && mPrime.isPrime(mN / 2)) {
          return Z.valueOf(mN / 2);
        }
        return Z.valueOf(mN);
    }
  }
}

