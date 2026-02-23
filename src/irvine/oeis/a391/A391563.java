package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391563 a(n) is the number of ways to write n = p + q where p is prime and q is the reverse of a prime.
 * @author Sean A. Irvine
 */
public class A391563 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      final long q = mN - p;
      if (q % 10 != 0 && mPrime.isPrime(Functions.REVERSE.l(q))) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
