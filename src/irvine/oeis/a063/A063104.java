package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063104 a(0) = 0, a(n) = smallest composite k such that phi(k + 2^n) = phi(k) + 2^n; also cototient(k + 2^n) = cototient(k).
 * @author Sean A. Irvine
 */
public class A063104 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (mN == 63) {
      throw new UnsupportedOperationException();
    }
    final long s = 1L << mN;
    long k = 3;
    while (true) {
      if (!mPrime.isPrime(++k) && Euler.phi(k + s).equals(Euler.phi(k).add(s))) {
        return Z.valueOf(k);
      }
    }
  }
}
