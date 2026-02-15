package irvine.oeis.a392;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392264 a(n) is the least prime p such that n + p is the digit reversal of a prime.
 * @author Sean A. Irvine
 */
public class A392264 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final long m = mN + p;
      if (m % 10 != 0 && mPrime.isPrime(Functions.REVERSE.l(m))) {
        return Z.valueOf(p);
      }
    }
  }
}
