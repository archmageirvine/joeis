package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Carmichael;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A033502 Carmichael numbers of the form (6*k+1)*(12*k+1)*(18*k+1), where 6*k+1, 12*k+1 and 18*k+1 are all primes.
 * @author Sean A. Irvine
 */
public class A033502 extends AbstractSequence {

  /* Construct the sequence. */
  public A033502() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = Z.valueOf(6 * mN + 1);
      if (mPrime.isPrime(a)) {
        final Z b = Z.valueOf(12 * mN + 1);
        if (mPrime.isPrime(b)) {
          final Z c = Z.valueOf(18 * mN + 1);
          if (mPrime.isPrime(c)) {
            final Z n = a.multiply(b).multiply(c);
            if (!mPrime.isPrime(n) && n.mod(Carmichael.lambda(n)).equals(Z.ONE)) {
              return n;
            }
          }
        }
      }
    }
  }
}
