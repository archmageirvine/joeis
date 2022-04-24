package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056583 Solution to a(n)^(n^2/a(n)) = gcd(n^n, Product_{k&lt;n} k^k) where a(n) and n^2/a(n) are integers, or 0 if no such integers exist.
 * @author Sean A. Irvine
 */
public class A056583 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    switch (++mN) {
      case 2:
        return Z.ONE;
      case 4:
        return Z.ZERO;
      case 8:
        return Z.valueOf(16);
      case 9:
        return Z.valueOf(27);
      default:
        if (mPrime.isPrime(mN)) {
          return Z.ONE;
        }
        if ((mN & 1) == 0 && mPrime.isPrime(mN / 2)) {
          return Z.valueOf(2L * mN);
        }
        return Z.valueOf(mN);
    }
  }
}

