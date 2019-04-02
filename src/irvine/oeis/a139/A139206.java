package irvine.oeis.a139;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A139206 Smallest son factorial prime p of order n: smallest p such that p!/n-1 is prime.
 * @author Sean A. Irvine
 */
public class A139206 implements Sequence {

  final Fast mPrime = new Fast();
  int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z f = Z.ONE;
    long p = 1;
    final Z n = Z.valueOf(mN);
    while (true) {
      f = f.multiply(++p);
      if (mPrime.isPrime(p)) {
        final Z[] t = f.subtract(mN).divideAndRemainder(n);
        if (Z.ZERO.equals(t[1]) && mPrime.isPrime(t[0])) {
          return Z.valueOf(p);
        }
      }
    }
  }
}

