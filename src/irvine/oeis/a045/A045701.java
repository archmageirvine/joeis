package irvine.oeis.a045;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045701 Number of ways n can be written as a sum of a square of a prime and a cube of a prime.
 * @author Sean A. Irvine
 */
public class A045701 extends Sequence1 {

  private final Fast mPrime = new Fast();
  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long q2, p = 2; (q2 = mN - p * p * p) >= 4; p = mPrime.nextPrime(p)) {
      final long q = Functions.SQRT.l(q2);
      if (q * q == q2 && mPrime.isPrime(q)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
