package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030996 Concatenation of n consecutive primes starting with the prime a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A030996 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long start = 1;
    while (true) {
      start = mPrime.nextPrime(start);
      final StringBuilder t = new StringBuilder();
      for (long k = 0, p = start; k < mN; ++k, p = mPrime.nextPrime(p)) {
        t.append(p);
      }
      if (new Z(t).isProbablePrime()) {
        return Z.valueOf(start);
      }
    }
  }
}
