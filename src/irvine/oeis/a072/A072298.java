package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A072298 Smallest integer k such that for no integer m, m! is divisible by n^k but not by n^(k+1).
 * @author Sean A. Irvine
 */
public class A072298 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(mN);
    }
    Z f = Z.ONE;
    long m = 1;
    long k = 0;
    while (true) {
      f = f.multiply(++m);
      final Z[] qr = f.divideAndRemainder(mN);
      if (qr[1].isZero()) {
        ++k;
        f = qr[0];
        if (f.mod(mN) == 0) {
          return Z.valueOf(k);
        }
      }
    }
  }
}

